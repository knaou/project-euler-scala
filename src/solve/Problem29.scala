package solve
import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet

object Problem29 extends App {
  val vals = new HashSet[BigInt]
  Range(2,100 + 1).foreach(a => Range(2, 100 + 1).foreach(b =>
    vals += Range(1, b + 1).foldLeft(BigInt.apply(1)){(b,d) => b * a}
  ))
  
  println(vals.size)
}