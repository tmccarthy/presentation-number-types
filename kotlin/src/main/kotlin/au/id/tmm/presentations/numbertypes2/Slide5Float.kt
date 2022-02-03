package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.Utils.displayExactly
import au.id.tmm.presentations.numbertypes2.types.MiniFloat
import kotlin.math.nextDown
import kotlin.math.nextUp

object Slide5Float {

  @JvmStatic
  fun main(args: Array<String>) {
    displayExactly(Float.MAX_VALUE)
    displayExactly(Float.MAX_VALUE.nextDown())
  }

}