package solve

object Problem27 extends App {
  val primes = Problem3.genPrime().takeWhile(_ < 1000000).toSet
  def isPrime(v: Int): Boolean = primes.contains(v)
  
  def f(n: Int, a: Int, b: Int): Int = n * n + a * n + b
  def calcLen(a: Int, b: Int): Int = {
    var n = 0
    while (isPrime(f(n, a, b))) n += 1
    n
  }
  
  var maxLen = 0
  var ab = (0, 0)
  Problem3.genPrime().takeWhile(_ < 1000).foreach(b => {
    println("b = %d".format(b))
    Range(-999, 1000).foreach(a => {
      if (isPrime(f(maxLen, a, b.toInt))) {
        val len = calcLen(a, b.toInt)
        if (maxLen < len) {
          maxLen = len
          ab = (a, b.toInt)
        }
      }
    })})

  println("%s:%d => %d".format(ab.toString(), ab._1 * ab._2, maxLen))
}