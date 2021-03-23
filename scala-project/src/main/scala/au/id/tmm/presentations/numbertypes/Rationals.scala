package au.id.tmm.presentations.numbertypes

import spire.math.Rational

object Rationals {

  def main(args: Array[String]): Unit = {
    noDivisionErrors()
  }

  private def noDivisionErrors(): Unit = {
    val third = Rational(1, 3)

    displayExactly(third)
    displayExactly(third + third + third)
    displayExactly(third * Rational(3))
  }

  private def displayExactly(value: Rational): Unit = {
    println(s"$value (${value.numerator} / ${value.denominator})")
  }

}
