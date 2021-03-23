package au.id.tmm.presentations.numbertypes

object SignedIntegers {

  def main(args: Array[String]): Unit = {
    overflows()
  }

  private def range(): Unit = {
    println(Int.MinValue)
    println(Int.MaxValue)
  }

  private def overflows(): Unit = {
    println(Int.MaxValue + 1)
    println(0 - 1)
  }

  private def safeArithmetic(): Unit = {
    println(math.addExact(1, 1))
    println(math.addExact(Int.MaxValue, 1))
  }

  private def division(): Unit = {
    println(2 / 2)
    println(2 / 3)
  }

  private def divisionByZero(): Unit = {
    println(1 / 0)
  }

  private def zeroDivisionByZero(): Unit = {
    println(0 / 0)
  }

}
