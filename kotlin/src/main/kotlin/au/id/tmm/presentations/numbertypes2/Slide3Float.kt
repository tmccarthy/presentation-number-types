package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.Utils.displayExactly

object Slide3Float {

  @JvmStatic
  fun main(args: Array<String>) {
    val delta: Float = 0.1f
    val coefficient = 100_000

    var computedByLoop: Float = 0f
    for (i in 1..coefficient) {
      computedByLoop = computedByLoop + delta
    }

    val computedExactly = delta * coefficient

    displayExactly(computedByLoop)
    displayExactly(computedExactly)
  }

}