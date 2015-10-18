package solve

object Problem25 extends App {
  def gen_fiv_big(v1: BigInt, v2: BigInt): Stream[BigInt] =
    (v1 + v2) #:: gen_fiv_big(v2, v1 + v2)
  def fiv_big(): Stream[BigInt] = BigInt.apply(1) #:: BigInt.apply(1) #:: BigInt.apply(2) #:: gen_fiv_big(BigInt.apply(1), BigInt.apply(2) )
  
  println( fiv_big.zipWithIndex.dropWhile(_._1.toString().length() < 1000).head._2 + 1 )
}
