package scala0227

/**
 * @author liuhuixu
 * @create 2020-02-27 18:07
 */
object Array_test {
  def main(args: Array[String]): Unit = {
    //定义一维数组,循环打印输出数据
    var arr1 = new Array[Int](3)
    arr1(0)=100
    arr1(1)=200
    arr1(2)=300
    arr1.foreach(println(_))
    arr1.foreach(x=>println(x))
    print("----------------------------"+"\n")
    //定义二维数组,循环打印输出数据
    var arr2 = new Array[Array[Int]](3)
    arr2(0)=Array[Int](1,2,3)
    arr2(1)=Array[Int](1,2,3,4)
    arr2(2)=Array[Int](1,2,3,4,5)
    arr2.foreach(aaa=>aaa.foreach(print))
    for(a<-arr2){
      println(a.toBuffer)
    }

    print("----------------------------"+"\n")
    //定义string类型的数组,将多个数组合并
    val arr3 = Array[String]("a","b","c","d")
    val arr4 = Array[String]("e","f","g")
    val arrays: Array[String] = Array.concat(arr3,arr4)
    arrays.foreach(print(_))
  }
}
