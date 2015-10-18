package solve
import scala.util.control.Breaks

object Problem2 extends App {
  def gen_fiv(v1: Int, v2: Int): Stream[Int] =
    (v1 + v2) #:: gen_fiv(v2, v1 + v2)
  def fiv(): Stream[Int] = 1 #:: 1 #:: 2 #:: gen_fiv(1, 2)

  println(fiv.takeWhile(_ < 400 * 10000).filter(_ % 2 == 0).foldLeft(0) { _ + _ })
}