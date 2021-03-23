package au.id.tmm.presentations.numbertypes

object FloatingPoints {

  def main(args: Array[String]): Unit = {
    exactRepresentability()
  }

  private def exactRepresentability(): Unit = {
    println(1f)
    displayExactly(1f)
    println()
    println(2f)
    displayExactly(2f)
    println()
    println(0.5f)
    displayExactly(0.5f)
    println()
    println(0.3f)
    displayExactly(0.3f)
    println()
    println(0.1f)
    displayExactly(0.1f)
    println()
  }

  private def floatingPointErrors(): Unit = {
    val delta: Float = 0.01f
    val coefficient = 100_000

    var computedByLoop: Float = 0f
    for (i <- 0 to coefficient) {
      computedByLoop = computedByLoop + delta
    }

    val computedByMultiplication = delta * coefficient

    displayExactly(computedByLoop)
    displayExactly(computedByMultiplication)
  }

  private def equality(): Unit = {
    displayExactly(0.1f * 0.1f)
    displayExactly(0.01f)
  }

  private def infinities(): Unit = {
    displayExactly(Float.MaxValue * Float.MaxValue)
    displayExactly(1f / 0f)
    displayExactly(-1f / 0f)
  }

  private def nans(): Unit = {
    println(math.sqrt(-1f))
    println(0f / 0f)
    println(Float.PositiveInfinity + Float.NegativeInfinity)

    println(Float.NaN + 0f)
    println(Float.NaN * 0f)
    println(Float.NaN == Float.NaN)
  }

  private def precisions(): Unit = {
    displayExactly(1f)
    displayExactly(math.nextUp(1f))
    println()

    // 1 billion
    displayExactly(1000000000f)
    displayExactly(math.nextUp(1000000000f))
    println()
  }

  private def reallyBigNumbers(): Unit = {
    displayExactly(Float.MaxValue)
    displayExactly(Float.MaxValue + 1)
    displayExactly(Float.MaxValue + 99999999f)
  }

  private def signedZero(): Unit = {
    displayExactly(0f)
    displayExactly(-0f)
    displayExactly(0f * -1f)
//    println(0f == -0f)
//    println(0f > -0f)
  }

  private def displayExactly(float: Float): Unit = {
    val exponent: Int    = math.getExponent(float)
    val significand: Int = math.round(float / math.pow(2, exponent).toFloat)

    printf("%.30f (%d x 2 ^ %d)\n", float, significand, exponent)
  }

}
