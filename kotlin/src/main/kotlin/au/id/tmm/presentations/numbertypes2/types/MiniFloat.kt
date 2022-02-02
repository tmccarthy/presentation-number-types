package au.id.tmm.presentations.numbertypes2.types

/**
 * A floating-point number with a range of values small enough to make it efficient to test every value.
 *
 * `MiniFloat` can have one of the following 14 values:
 * <ul>
 *  <li>`NegativeInfinity`</li>
 *  <li>`-8.0`</li>
 *  <li>`-4.0`</li>
 *  <li>`-2.0`</li>
 *  <li>`-1.0`</li>
 *  <li>`-0.5`</li>
 *  <li>`0.0`</li>
 *  <li>`0.5`</li>
 *  <li>`1.0`</li>
 *  <li>`2.0`</li>
 *  <li>`4.0`</li>
 *  <li>`8.0`</li>
 *  <li>`PositiveInfinity`</li>
 *  <li>`NaN`</li>
 * </ul>
 *
 * In almost all respects (overflows, value approximation, floating point errors) it behaves similarly to `Float` and
 * `Double`. The main difference is that `MiniFloat` does not support the `-0.0` value, which is represented as `0.0`.
 */
sealed class MiniFloat private constructor(val toFloat: Float) {

  fun toFloat(): Float   = toFloat
  fun toDouble(): Double = toFloat.toDouble()
  fun toInt(): Int       = toFloat.toInt()
  fun toLong(): Long     = toFloat.toLong()

  operator fun plus(that: MiniFloat): MiniFloat = MiniFloat.from(this.toFloat + that.toFloat)
  operator fun minus(that: MiniFloat): MiniFloat = MiniFloat.from(this.toFloat - that.toFloat)
  operator fun times(that: MiniFloat): MiniFloat = MiniFloat.from(this.toFloat * that.toFloat)
  operator fun div(that: MiniFloat): MiniFloat = MiniFloat.from(this.toFloat / that.toFloat)
  operator fun unaryMinus() : MiniFloat           = MiniFloat.from(-this.toFloat)

  fun isNaN(): Boolean    = toFloat.isNaN()
  fun isFinite(): Boolean = toFloat.isFinite()

  override fun toString() = toFloat().toString()

  override fun equals(other: Any?): Boolean = when (other) {
    is MiniFloat -> this.toFloat == other.toFloat
    else         -> false
  }

  override fun hashCode(): Int = java.lang.Float.hashCode(toFloat)

  companion object {

    object PositiveInfinity : MiniFloat(Float.POSITIVE_INFINITY)
    object NegativeInfinity : MiniFloat(Float.NEGATIVE_INFINITY)
    object NaN              : MiniFloat(Float.NaN)

    private data class Finite constructor (val significand: Int, val exponent: Int): MiniFloat(significand * Math.pow(Finite.base.toDouble(), exponent.toDouble()).toFloat()) {
      override fun toString() = toFloat().toString()

      companion object {

        private val base = 2

        private val minSignificand = -2
        private val maxSignificand = 2

        private val minExponent = -1
        private val maxExponent = 2

        val zero        = Finite(0, 0)
        val max         = Finite(maxSignificand, maxExponent)
        val min         = Finite(minSignificand, maxExponent)
        val minPositive = Finite(significand = 1, exponent = minExponent)

        /**
         * Returns `None` if the given float cannot fit in an instance of `Finite`.
         */
        fun from(float: Float): Finite? {
          val exponent: Int    = Math.getExponent(float)
          val significand: Int = Math.round(float / Math.pow(Finite.base.toDouble(), exponent.toDouble()).toFloat())

          if (significand == 0 || exponent < minExponent) {
            return zero
          } else if (withinBounds(significand, exponent)) {
            return Finite(significand, exponent)
          } else if (exponent > maxExponent) {
            try {
              val ordersOfMagnitudeToShift = Math.subtractExact(exponent, maxExponent)

              val proposedSignificand: Int = Math.multiplyExact(significand, Math.pow(base.toDouble(), ordersOfMagnitudeToShift.toDouble()).toInt())
              val proposedExponent: Int    = Math.subtractExact(exponent, ordersOfMagnitudeToShift)

              if (withinBounds(proposedSignificand, proposedExponent)) {
                return Finite(proposedSignificand, proposedExponent)
              } else {
                return null
              }
            } catch (e: ArithmeticException) {
              return null
            }
          } else {
            return null
          }
        }

        private fun withinBounds(significand: Int, exponent: Int): Boolean =
          (minExponent <= exponent && exponent <= maxExponent) &&
            (minSignificand <= significand && significand <= maxSignificand)


      }
    }

    val Zero: MiniFloat        = MiniFloat.from(0f)
    val NegativeOne: MiniFloat = MiniFloat.from(-1f)
    val One: MiniFloat         = MiniFloat.from(1f)

    val MaxValue: MiniFloat         = Finite.max
    val MinValue: MiniFloat         = Finite.min
    val MinPositiveValue: MiniFloat = Finite.minPositive

    fun from(float: Float): MiniFloat =
      when  {
        float == Float.POSITIVE_INFINITY -> PositiveInfinity
          float == Float.NEGATIVE_INFINITY -> NegativeInfinity
          float.isNaN()           -> NaN
        else -> Finite.from(float)?: (if (float > 0) PositiveInfinity else NegativeInfinity)

      }

    fun from(double: Double): MiniFloat = from(double.toFloat())
    fun from(int: Int): MiniFloat       = from(int.toFloat())
    fun from(long: Long): MiniFloat     = from(long.toFloat())

  }
}
