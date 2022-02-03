package au.id.tmm.presentations.numbertypes2

import java.math.BigDecimal

object Slide6Decimal {

  @JvmStatic
  fun main(args: Array<String>) {
    val x = BigDecimal("1.000000000") / BigDecimal("3.000000000")

    println(x + x + x)
  }

}