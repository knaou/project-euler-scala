package solve

object Problem1 extends App {
  var sum = 0
  Range(3, 1000).withFilter(v => (v % 3) == 0 || (v % 5) == 0).foreach(sum += _)
  println("Resule:" + sum.toString())
}
