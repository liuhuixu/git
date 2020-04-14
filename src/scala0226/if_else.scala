package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/25 - 18:36
  */
object if_else {
  def main(args: Array[String]): Unit = {
    def max(a:Int,b:String)={
      if(a>0) a else b
    }
    val value:Any = max(100,"hello")
    //println(value)
  }
  /**
    * to和until
    * 例：
    * 1 to 10 返回1到10的Range数组，包含10
    * 1 until 10 返回1到10 Range数组 ，不包含10
    */
  println(1 to 10 )//打印 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
  println(1.to(10))//与上面等价，打印 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

  println(1 to (10 ,2))//步长为2，从1开始打印 ，1,3,5,7,9
  println(1.to(10, 2))

  println(1 until 10 ) //不包含最后一个数，打印 1,2,3,4,5,6,7,8,9
  println(1.until(10))//与上面等价

  println(1 until (10 ,3 ))//步长为2，从1开始打印，打印1,4,7
  val r = 1.to(10)
  println(r)
  val r1 = 1 until 10
  println(r1)
  for(i <- 1 until 10){
    println(i)
  }
  for(i <- 1 until 10){
    for(j<-1 until 10){
      if(i>=j){
         print(i+"*"+j+"="+i*j+"\t")
        //print(s"$i*$j=$i*$j"+"\t")
      }
      if(i==j){
        println()
      }
    }
  }
}
