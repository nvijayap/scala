// ---------------------------------------------------------------
//
// File: circle.scala
//
// Running -
//
// $ scala circle.scala
//
// ---------------------------------------------------------------

def circle(r:Int) = {
  (2 * math.Pi * r, math.Pi * r * r)
}

val (circumference, area) = circle(1)
println(circumference)
println(area)

