package au.id.tmm.presentations.numbertypes

import spire.math._

object UnsignedIntegers {

  def main(args: Array[String]): Unit = {
    zeroDivisionByZero()
  }

  private def range(): Unit = {
    println(UInt.MinValue)
    println(UInt.MaxValue)
  }

  private def overflows(): Unit = {
    println(UInt.MaxValue + UInt(1))
    println(UInt(0) - UInt(1))
  }

  private def division(): Unit = {
    println(UInt(2) / UInt(2))
    println(UInt(2) / UInt(3))
  }

  private def divisionByZero(): Unit = {
    println(UInt(1) / UInt(0))
  }

  private def zeroDivisionByZero(): Unit = {
    println(UInt(0) / UInt(0))
  }

}
