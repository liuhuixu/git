package scala_0228

import scala.collection.mutable.ListBuffer

/**
 * @author liuhuixu
 * @create 2020-02-29 13:15
 */
object List_plus {
  def main(args: Array[String]): Unit = {
    val list = List(1, 4, 3, 5, 7, 2, 9, 0, 19, 88, 77, 67, 44, 99)
    //将一组集合中的元素分成若干个组
    val res: Iterator[List[Int]] = list.grouped(4)
    //println(res.toList)
    //将若干个组中的值求和
    res.map(_.sum).foreach(println)

    //自定义一个函数,传入一个listBuffer类型的集合 求最大值
    var f1: ListBuffer[Int] => Int = (list: ListBuffer[Int]) => {
      list.max
    }
    val list1 = ListBuffer(1, 2, 33, 4, 5, 65)
    println(f1(list1))
    //反转元素
    val r1 = list1.reverse
    println(r1)
    //排序:正序排序
    val s1 = list1.sorted
    println(s1)
    //排序:倒序排序
    val s2 = list1.sorted.reverse
    println(s2)
  }
}
