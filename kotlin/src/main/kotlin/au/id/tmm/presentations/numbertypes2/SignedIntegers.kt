package au.id.tmm.presentations.numbertypes2

object SignedIntegers {

  @JvmStatic
  fun main(args: Array<String>) {
    // range()
    // overflows()
    // safeArithmetic()
    // division()
    // divisionByZero()
    // divisionZeroByZero()
  }

  private fun range() {
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
  }

  private fun overflows() {
    println(Int.MAX_VALUE + 1)
    println(0 - 1)
  }

  private fun safeArithmetic() {
    println(StrictMath.addExact(1, 1))
    println(StrictMath.addExact(Int.MAX_VALUE, 1))
  }

  private fun division() {
    println(2 / 2)
    println(2 / 3)
  }

  private fun divisionByZero() {
    println(1 / 0)
  }

  private fun divisionZeroByZero() {
    println(0 / 0)
  }

}