package solve

object Problem21 extends App {
  val sum_prop = Range(1, 10000).map(v1 => Range(1, v1).filter(v2 => v1 % v2 == 0).sum)
  println(sum_prop.zipWithIndex.filter { x =>
    if (x._1 > 1 && x._1 <= 10000) { x._1 != x._2 + 1 && sum_prop(x._1.toInt - 1) == x._2 + 1 } else { false }
  }.foldLeft(0)(_ + _._1))
}
