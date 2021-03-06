// -----------------------------------------------------------------
//
// File: rpolygon.scala (rpolygon: regular polygon)
//
// Running -
//
// $ scala rpolygon.scala
//
// -----------------------------------------------------------------

def rpolygon(n:Int, s:Int) = { // n: # of sides, s: length of side
  (n * s, 0.25 * n * s * s / math.tan(math.Pi/n))
}

val (circumference, area) = rpolygon(4,3) // regular polygon of 4 sides, each side = 3 units
println("=> Circumference: " + circumference)
println("=> Area: " + area)

val (circumference2, area2) = rpolygon(5,3) // regular polygon of 5 sides, each side = 3 units
println("=> Circumference: " + circumference2)
println("=> Area: " + area2)

