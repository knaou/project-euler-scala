package solve
import scala.collection.mutable.ListBuffer

object Problem26 extends App {
	def calcDenominator(v:Int):Int = {
	  var num = 1
	  val list = new ListBuffer[Int]
	  while(!list.contains(num)){
	    list += num
	    num *= 10
	    
	    val s = num / v
	    val a = num % v
	    
	    if( a == 0 ) return 0
	    num = a
	  }
	  val last =  list.zipWithIndex.filter(_._1 == list.last).dropRight(1)
	  return list.length - ( if(last.length == 0) 0 else last.last._2)
	}
	
	println(Range(1,1000).map(v => (calcDenominator(v), v)).reduceLeft((a,b) => if (a._1 > b._1) a else b))
    
}
