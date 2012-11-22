import scala.util.Random._;

object TestCreator extends App {
  
	def createAllWires(n : Int) : Seq[(Int, Int, Int)] =
	  for {
	    x <- 0 until n
	    y <- 0 until n
	    direction <- 0 to 1
	    if(!(x == n-1 && direction == 0) && !(y == n-1 && direction == 1))
	  } yield (x, y, direction)
	  
	def lists = shuffle(createAllWires(3)).unzip3
	println(lists._1)
}