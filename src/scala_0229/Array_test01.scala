package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 16:20
 */
object Array_test01 {

    //1.	定义一个Array数组Array(1,2,3,8,7,9,10,5)使用两种方式进行循环
    def main(args: Array[String]): Unit = {
      var arr1 = Array(1,2,3,8,7,9,10,5)
      //第一种
      for(i<-arr1){println(i)}
      //第二种
      for(i<-0 to arr1.length-1) println(arr1(i))
  }
}
