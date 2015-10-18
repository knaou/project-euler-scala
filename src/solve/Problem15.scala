package solve

object Problem15 extends App {
  def factorial(v: Long): BigInt = {
    if (v == BigInt.apply(1)) {
      BigInt.apply(1)
    } else {
      BigInt.apply(v) * factorial(v - 1)
    }

  }

  println(factorial(40) / factorial(20) / factorial(20))

}