
/**
 * Standalone Scala Object called NextHigher -
 * When a positive integer is passed as arg, the next higher positive integer
 * is returned by rearranging the digits in the passed arg.
 * 
 * NOTE: -1 is returned if next higher number is not found.
 * 
 * @author Naga Vijayapuram
 */
object NextHigher extends App {

	private def isNumeric(input: String): Boolean = { input.forall(_.isDigit) }

	if (args.length != 1 || args(0).length() < 2 || !isNumeric(args(0))) {
		println("=> Need a positive integer of minimally two digits as arg")  
	}

  val number = args(0).toInt
  
  private def getNextHigher(array: Array[String]): Int = {
    array.foreach {
      n => if (n.toInt > number) return n.toInt
    }
    -1
  }
    
  val nextHigher = getNextHigher(number.toString.permutations.toArray.sorted) 
  
  nextHigher match {
    case -1 => println("Next Higher Number Not Found")
    case _ => println(nextHigher)
  }

}

