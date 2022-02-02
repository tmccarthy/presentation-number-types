package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.types.MiniFloat

object Slide4MiniFloat {

  @JvmStatic
  fun main(args: Array<String>) {
    overflow()
    underflow()
    division()
    divisionByZero()
    divisionZeroByZero()
    imprecisionTooLow()
    imprecisionTooHigh()
  }

  private fun overflow() {
    println(MiniFloat.MaxValue + MiniFloat.from(16))
  }

  private fun underflow() {
    println(MiniFloat.MaxValue - MiniFloat.from(16))
  }

  private fun division() {
    println(MiniFloat.from(4) / MiniFloat.from(2))
    println(MiniFloat.from(1) / MiniFloat.from(2))
    println(MiniFloat.from(2) / MiniFloat.from(3))
  }

  private fun divisionByZero() {
    println(MiniFloat.from(1) / MiniFloat.from(0))
  }

  private fun divisionZeroByZero() {
    println(MiniFloat.from(0) / MiniFloat.from(0))
  }

  private fun imprecisionTooLow() {
    println(MiniFloat.from(0) + MiniFloat.from(0.25))
  }

  private fun imprecisionTooHigh() {
    println(MiniFloat.from(4) + MiniFloat.from(1))
  }

}