package solve

object Problem6 extends App {
  def sum_v2(n: Int): Int = n match {
    case n if n == 1 => 1
    case n if n > 1 => n * n + sum_v2(n - 1)
  }

  def sumv_2(n: Int): Int = {
    var sum = 0
    for (i <- 1 to n) { sum += i }
    sum * sum
  }

  val n = 100
  println(sumv_2(n) - sum_v2(n))
}