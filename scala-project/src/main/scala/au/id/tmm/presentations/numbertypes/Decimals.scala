package au.id.tmm.presentations.numbertypes

import java.math.{BigDecimal => JavaBigDecimal}

object Decimals {

  def main(args: Array[String]): Unit = {
    equality()
  }

  private def exactRepresentability(): Unit = {
    displayExactly(BigDecimal("1"))
    println()
    displayExactly(BigDecimal("2"))
    println()
    displayExactly(BigDecimal("0.5"))
    println()
    displayExactly(BigDecimal("0.3"))
    println()
    displayExactly(BigDecimal("0.1"))
    println()
    displayExactly(BigDecimal("1234000"))
    println()

    displayExactly(BigDecimal("1") / BigDecimal("3"))
    println()
  }

  private def decimalErrors1(): Unit = {
    val delta: BigDecimal = BigDecimal("0.01")
    val coefficient = 100_000

    var computedByLoop: BigDecimal = BigDecimal("0")
    for (i <- 0 to coefficient) {
      computedByLoop = computedByLoop + delta
    }

    val computedByMultiplication = delta * BigDecimal(coefficient)

    displayExactly(computedByLoop)
    displayExactly(computedByMultiplication)
  }

  private def decimalErrors2(): Unit = {
    val third = BigDecimal("1") / BigDecimal("3")

    displayExactly(third * BigDecimal("3"))
    displayExactly(third + third + third)
  }

  private def equality(): Unit = {
    println(BigDecimal("0.1") == BigDecimal("0.10"))

    println(new JavaBigDecimal("0.1") == new JavaBigDecimal("0.10"))
  }

  private def displayExactly(value: BigDecimal): Unit = {
    val fraction = value.underlying().unscaledValue()
    val exponent = value.scale

    println(s"$value ($fraction x 10 ^ $exponent)")
  }

}
