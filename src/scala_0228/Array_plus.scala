package scala_0228

import scala.util.Sorting

/**
 * @author liuhuixu
 * @create 2020-02-29 13:04
 */
object Array_plus {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(99, 34, 66)
    println(arr.toBuffer)
    println(arr.mkString)
    println(arr.mkString(","))
    println(arr.mkString("[",",","]"))
    Sorting.quickSort(arr)
    println(arr.toBuffer)
  }
}
