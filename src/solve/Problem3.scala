package solve
import scala.collection.mutable.ListBuffer

object Problem3 extends App {
  def genPrime(n: Long = 2, ns: ListBuffer[Long] = new ListBuffer()): Stream[Long] = {
    if (ns.exists(n % _ == 0)) {
      genPrime(n + 1, ns)
    } else {
      ns += n
      n #:: genPrime(n + 1, ns)
    }
  }

  def primeDecompN(v: Long, n: Long, it: Iterator[Long]): Stream[Long] = v match {
    case v if v < n => Stream()
    case v if v % n == 0 => n #:: primeDecompN(v / n, n, it)
    case _ => primeDecompN(v, it.next, it)
  }

  def primeDecomp(v: Long) = {
    val it = genPrime().iterator
    val n = it.next()
    primeDecompN(v, n, it)
  }

  val v = 600851475143L
  println(primeDecomp(v).toList.mkString("Result is ", " * ", " = " + v.toString))
}