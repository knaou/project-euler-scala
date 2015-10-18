package solve

object Problem23 extends App {  
	val abundants = Range(1, 28123).filter( v => Range(1, v).filter(v % _ == 0).sum > v ).toSet
	println( Range(1, 28123 + 1).filter(v => !abundants.exists(v2 => abundants.contains(v - v2))).sum )
}
