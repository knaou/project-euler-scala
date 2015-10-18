package solve

object Problem4 extends App {
  def isPalindromic(v: Int): Boolean = {
    val s = v.toString()
    val len2 = s.length() / 2
    s.substring(0, len2) == s.substring(s.length() - len2).reverse
  }

  val n = for (i <- 1 to 999; j <- i to 999 if isPalindromic(i * j)) yield i * j
  println(n.max)
}