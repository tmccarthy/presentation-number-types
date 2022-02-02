package au.id.tmm.presentations.numbertypes2

object Utils {
  fun displayExactly(float: Float) {
    println("$float (${String.format("%.17f", float)})")
  }
}