package solve

object Problem31 extends App {
	val pcoin = List(1,2,5,10,20,50,100,200).reverse
	def total(nums:List[Int]):Int = nums.zip(pcoin).foldLeft(0)((b,n) => b + (n._1 * n._2))
	
	def check(i:Int, list:List[Int]):Int = {
	  if(i >= list.length){
		  return if (total(list) == 200) {
		    println (list.toString + " -> 200!")
		    1
		  }
		  else 0
	  }
	  
	  var sum = 0
	  for(c <- 0 to 200 / pcoin(i)){
	    val list2 = list.updated(i, c)
	    if( total(list2) <= 200 ){
	      sum += check(i + 1, list2)
	    }
	  }
	  sum
	}
	
	println(check(0, List.fill(pcoin.length)(0)))
}