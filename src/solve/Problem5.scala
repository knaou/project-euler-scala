package solve
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashMap

object Problem5 extends App {
  val mp = new HashMap[Long, Int]
  var sum = 1L
  for (i <- 1 to 20) {
    val list = Problem3.primeDecomp(i).toList
    var nm = 1L
    list.toSet.foreach { v: Long =>
      val c = list.count(_ == v)
      if (!mp.contains(v)) {
        nm *= v * c
        mp.update(v, c)
      } else if (mp(v) < c) {
        nm *= v * (c - mp(v))
        mp.update(v, c)
      }
    }
    sum *= nm
  }

  println(sum)
}