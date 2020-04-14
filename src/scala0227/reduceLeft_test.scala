package scala0227

/**
 * @author liuhuixu
 * @create 2020-02-27 17:41
 */
object reduceLeft_test extends App {
  override def main(args: Array[String]): Unit = {
    val arr = Array(1, 333, 4, 6, 4, 4, 9, 32, 6, 9, 0, 2)
    println(arr.reduceLeft(f1))
    def f1(l: Int, r: Int): Int = {
      if (l > r) l else r
    }
  }
}
