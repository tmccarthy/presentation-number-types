package au.id.tmm.presentations.numbertypes2

object Slide2UnsignedIntegers {

  @JvmStatic
  fun main(args: Array<String>) {
    range()
    overflows()
    safeArithmetic()
    division()
    divisionByZero()
    divisionZeroByZero()
  }

  private fun range() {
    println(UInt.MIN_VALUE)
    println(UInt.MAX_VALUE)
  }

  private fun overflows() {
    println(UInt.MAX_VALUE + 1u)
    println(UInt.MIN_VALUE - 1u)
  }

  private fun safeArithmetic() {
    // TODO 🤷
    // println(StrictMath.addExact(1u, 1u))
    // println(StrictMath.addExact(UInt.MAX_VALUE, 1u))
  }

  private fun division() {
    println(2u / 2u)
    println(2u / 3u)
  }

  private fun divisionByZero() {
    println(1u / 0u)
  }

  private fun divisionZeroByZero() {
    println(0u / 0u)
  }

}