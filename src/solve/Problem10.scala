package solve

object Problem10 extends App {
  println(Problem3.genPrime().takeWhile(_ <= 200 * 10000).foldLeft(0L) { _ + _ })
}
