package solve

object Problem17 extends App {
  final val strs = Array("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
  final val strs2 = Array("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
  def count(v: Int): Int = {
    def count_(s: Int): Int = s match {
      case s if s < 20 => strs(s).length()
      case _ => strs2(s / 10).length() + strs(s % 10).length()
    }

    v match {
      case 1000 => "onethousand".length()
      case v if v >= 100 && v % 100 != 0 => "hundredand".length() + count_(v / 100) + count_(v % 100)
      case v if v >= 100 && v % 100 == 0 => "hundred".length() + count_(v / 100)
      case _ => count_(v)
    }
  }

  println(Range(1, 1000 + 1).foldLeft(0) { _ + count(_) })

}