package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/25 - 19:32
  */
object while_do_test {
  def main(args: Array[String]): Unit = {
    var i =0
        do{
          println(s"第 $i 次求婚。。。")
          i+=1
        }while(i<100)

//    while (i<100){
//      println(s"第 $i 次求婚。。。")
//      i=i+1
//
//    }
  }

}
