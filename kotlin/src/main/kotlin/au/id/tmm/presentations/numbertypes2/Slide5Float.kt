package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.Utils.displayExactly
import kotlin.math.nextUp

object Slide5Float {

  @JvmStatic
  fun main(args: Array<String>) {
    countAsFarAsYouCan()
  }

  private fun countAsFarAsYouCan() {
    var counter: Float = 0f
    for (i in 1L..20_000_000L) {
      val newValue = counter + 1f
      if (newValue == counter) {
        displayExactly(counter)
        break
      } else {
        counter = newValue
      }
    }
  }

  private fun nextUp() {
    displayExactly(0f.nextUp())

    displayExactly(20_000_000f.nextUp())
  }

}