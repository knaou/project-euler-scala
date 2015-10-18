package solve

object Problem32 extends App{
  def list2i(l:List[Int]):Int = l.mkString("").toInt
   println(
       Problem24.gen_permutation(Range(1, 9 + 1).toList).foldLeft(Set[Int]()){(b, v) =>
         Range(1, 4+1).flatMap{i1 =>
           Range(1, 4+1).map{i2 =>
             
             val (v1, rest) = v.splitAt(i1)
             val (v2, v3) = rest.splitAt(i2)
             
             val v1i = list2i(v1)
             val v2i = list2i(v2)
             val v3i = list2i(v3)

             if( v1i * v2i == v3i ){
               println("%d x %d = %d".format(v1i, v2i, v3i))
               v3i
             }  else 0
           }
         }.toSet ++ b
       }.foldLeft(0){_ + _}
       )
}