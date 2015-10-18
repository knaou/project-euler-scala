package solve

object Problem12 extends App {
  def countDivisorFactor(v: Long): Int = {
    val primes = Problem3.primeDecomp(v).toList
    primes.toSet.foldLeft(1){(b, n) => b * (primes.count(_ == n) + 1)}
  }

  def genTrigonometric(n: Int = 1, sum: Long = 0): Stream[Long] = {
    (sum + n) #:: genTrigonometric(n + 1, sum + n)
  }

  println(genTrigonometric().dropWhile(countDivisorFactor(_) < 500).head)
}
