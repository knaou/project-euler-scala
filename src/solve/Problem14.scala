package solve
import scala.collection.mutable.HashMap

object Problem14 extends App {
  def countCollatz(v: Long): Int = v match {
    case 1 => 1
    case v if v % 2 == 0 => 1 + countCollatz(v / 2)
    case _ => 1 + countCollatz(3 * v + 1)
  }

  var max = 0
  var maxi = -1
  for (i <- 1 until 100 * 10000) {
    val c = countCollatz(i)
    if (max < c) { max = c; maxi = i }
  }

  println(maxi)
}