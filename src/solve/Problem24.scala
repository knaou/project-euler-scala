package solve

object Problem24 extends App {
  def gen_permutation(list: List[Int]): Stream[List[Int]] = {
    val ls = list.zip(list.drop(1)).reverse.dropWhile(v => v._1 > v._2).length
    if (ls == 0) {
      Stream(list)
    } else {
      val next = {
        val (l1, l2) = list.splitAt(ls)
        val n = l2.filter(l1.last < _).min
        l1.dropRight(1) ::: n :: (l1.last :: l2.filterNot(_ == n)).sortWith(_ < _)
      }
      list #:: gen_permutation(next)
    }
  }

  println(gen_permutation(Range(0, 10).toList).drop(100 * 10000 - 1).head.mkString(""))
}
