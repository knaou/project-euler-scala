package solve

object Problem30 extends App{
  println(Range(2, 500000).filter{ v =>
    v == v.toString().map(n => Math.pow(n.toString().toInt, 5).toInt).foldLeft(0){_ + _}}.foldLeft(0){_ + _})
}