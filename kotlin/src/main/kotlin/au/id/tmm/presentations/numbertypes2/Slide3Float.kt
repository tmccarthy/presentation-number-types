package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.Utils.displayExactly

object Slide3Float {

  @JvmStatic
  fun main(args: Array<String>) {
    overflow()
    underflow()
    division()
    divisionByZero()
    divisionZeroByZero()
    floatingPointError()
    nanEquality()
    negativeZero()
  }

  private fun overflow() {
    displayExactly(Float.MAX_VALUE)
  }

  private fun underflow() {
  }

  private fun division() {
  }

  private fun divisionByZero() {
  }

  private fun divisionZeroByZero() {
  }

  private fun floatingPointError() {
    val delta: Float = 0.5f
    val coefficient = 100_000

    var computedByLoop: Float = 0f
    for (i in 1..coefficient) {
      computedByLoop = computedByLoop + delta
    }

    val computedByMultiplication = delta * coefficient

    displayExactly(computedByLoop)
    displayExactly(computedByMultiplication)
  }

  private fun nanEquality() {
    println(Float.NaN == Float.NaN)
    println(Float.NaN.compareTo(Float.NaN))
  }

  private fun negativeZero() {
    displayExactly(0f)
    displayExactly(-0f)

    println(0f == -0f)
    println(0f > -0f) // <- check out the IntelliJ hint!
    println(-0f.compareTo(0f))
    println(0f.compareTo(-0f))

    println("Array:")
    val floats = floatArrayOf(-1f, -0f, 0f, 1f)
    floats.shuffle()
    floats.sort()
    for (float in floats) {
      displayExactly(float)
    }
  }

}