// ---------------------------------------------------------------
//
// File: square.scala
//
// Running -
//
// $ scala square.scala
//
// ---------------------------------------------------------------

def square(s:Int) = {
  (4 * s, s * s)
}

val (circumference, area) = square(3)
println("=> Circumference: " + circumference)
println("=> Area: " + area)

