package solve
import scala.collection.mutable.HashMap

object Problem22 extends App {
  val sortedStr = Problem22Data.str.sortWith(_ < _)

  println(
    sortedStr.foldLeft(0) { (b, str) =>
      b +
        (sortedStr.indexOf(str) + 1) * str.foldLeft(0)(_ + _.toInt - 'A'.toInt + 1)
    })

}
