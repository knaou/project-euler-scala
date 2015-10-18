package solve

object Problem20 extends App {
  println(
    Range(1, 100 + 1).foldLeft(BigInt.apply(1)) { _ * _ }
      .toString().foldLeft(0) { _ + _.toString().toInt })
}