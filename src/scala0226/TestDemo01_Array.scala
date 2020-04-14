package scala0226

import scala.util.Sorting

/**
  * @author liuhuixu
  * @date 2020/02/26 - 20:25
  */
object TestDemo01_Array {
  def main(args: Array[String]): Unit = {
    //1  创建一个数组 Int型， 5元素
    //val arr = new Array[Int](5)
    val arr: Array[Int] = Array(99,34,88,4,66)
    //2 元素操作
    //错误， 越界
    //arr(5) = 10
    println(arr(0))
    //3
    println("数组长度"+arr.length)
    println("数组长度"+arr.size)
    // 4 遍历
    for(i <- 0 until arr.length) {
      print(arr(i)+", ")
    }
    println()
    for(t <- arr) {
      print(t+", ")
    }

    //7 排序
    Sorting.quickSort(arr)

    // 6 mkString
    println("mkString: "+arr.mkString(","))
    println("mkString: "+arr.mkString("[",",","]"))
    println("最大值："+arr.max)
    println("和："+arr.sum)
  }
}
