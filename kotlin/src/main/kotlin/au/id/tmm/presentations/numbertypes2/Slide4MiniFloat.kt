package au.id.tmm.presentations.numbertypes2

import au.id.tmm.presentations.numbertypes2.types.MiniFloat

object Slide4MiniFloat {

  @JvmStatic
  fun main(args: Array<String>) {
    var counter: MiniFloat = MiniFloat.from(0)

    for (i in 1..8) {
      counter = counter + MiniFloat.from(1)
    }

    println(counter)
  }

}