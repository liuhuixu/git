package scala_0228

import java.util.Scanner

/**
 * @author liuhuixu
 * @create 2020-02-29 13:09
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    var sc = new Scanner(System.in)
    println("请输入:")
    val i = sc.nextInt()
    println(i)
  }
}
