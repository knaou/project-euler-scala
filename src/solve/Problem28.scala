package solve

object Problem28 extends App {
  def num(v:Int = 1):Stream[Int] =  v match{
    case 1 => 1 #:: num(2)
    case n => (4 * (2 * v - 1) * (2 * v - 1) - 12 * ( v - 1 )) #:: num(v + 1)
  }

  println(num().take((1001 - 1) / 2 + 1).sum)
}