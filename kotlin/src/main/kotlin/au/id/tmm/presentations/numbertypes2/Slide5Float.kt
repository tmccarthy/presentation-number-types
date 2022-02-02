package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.Utils.displayExactly
import kotlin.math.nextUp

object Slide5Float {

  @JvmStatic
  fun main(args: Array<String>) {
    imprecisionTooLow()
    imprecisionTooHigh()
    nextUp()
  }

  private fun imprecisionTooLow() {
  }

  private fun imprecisionTooHigh() {
  }

  private fun nextUp() {
    displayExactly(0f.nextUp())

    displayExactly(20_000_000f.nextUp())
  }

}