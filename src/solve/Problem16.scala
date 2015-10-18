package solve

object Problem16 extends App {
  println(
    BigInt.apply("1" + "0" * 1000, 2).toString()
      .foldLeft(0) { _ + _.toString().toInt })
}