package scala_0229

import scala.collection.mutable.ArrayBuffer

/**
 * @author liuhuixu
 * @create 2020-02-29 17:28
 */
object Array_test02 {
  def main(args: Array[String]): Unit = {
    //2.	编写一个Scala函数，传入一个ArrayBuffer类型的可变整型数组，
    // 对这个数组中的元素进行排序。编写测试代码，测试该函数。

    val f1 = (list:ArrayBuffer[Int])=>list.sorted
    var arr = ArrayBuffer(1, 2, 3, 4, 8, 7, 9, 11)
    val arr2 = f1(arr)
    println(arr2)
    println("-----------")
    println(arr2.toList)

  }
}
