package scala0227

object tuple_test {
  def main(args: Array[String]): Unit = {
    val tuple1: Tuple1[String] = new Tuple1("hello")
    val tuple2: (String, Int) = new Tuple2("a",10)
    val tuple3: (Int, Boolean, Char) = new Tuple3(1,true,'C')
    val tuple4 = (1,3.4,"abc",false)
    val tp22: (Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, String, Int, Int, Int, Int, Int, Int, Int, Int, Int) = (1,2,3,4,5,6,7,8,9,10,11,12,"abc",14,15,16,17,18,19,20,21,22)
    println(tuple2.swap)
    println(tuple4._4)

    val iterator: Iterator[Any] = tp22.productIterator
//    iterator.foreach(println(_))
    while (iterator.hasNext){
      println(iterator.next())
    }

//    for (a<-tuple3){
//      println(a)
//    }
  }


}
