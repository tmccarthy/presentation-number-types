package au.id.tmm.presentations.numbertypes2

object Slide2UnsignedIntegers {

  @JvmStatic
  fun main(args: Array<String>) {
    // overflow()
    // underflow()
    // exactAddition()
    // division()
    // divisionByZero()
    // divisionZeroByZero()
  }

  private fun overflow() {
    println(UInt.MAX_VALUE + 1u)
  }

  private fun underflow() {
    println(0u - 1u)
  }

  private fun exactAddition() {
    TODO() // 🤷
  }

  private fun division() {
    println(4u / 2u)
    println(2u / 3u)
  }

  private fun divisionByZero() {
    println(1u / 0u)
  }

  private fun divisionZeroByZero() {
    println(0u / 0u)
  }

}