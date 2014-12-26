// ---------------------------------------------------------------
//
// File: dist.scala (dist: distance between two points)
//
// Running -
//
// $ scala dist.scala
//
// ---------------------------------------------------------------

def dist(p1:(Int,Int), p2:(Int,Int)) = {
  val diffx = p2._1 - p1._1
  val diffy = p2._2 - p1._2
  math.sqrt(diffx * diffx + diffy * diffy)
}

println(dist((0,0),(3,4))) // just think of pythagorean theorem

