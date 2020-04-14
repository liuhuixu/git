package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 18:13
 */
object moshipipei02 {
  def main(args: Array[String]): Unit = {
    val list = List(List(1, 2), List(3), List(), List(4, 5, 6, 7), List(4, 5))
    for (l <- list) {
      l match {
        case Nil => println("空集合")
        case List(4, _*) => println("4开头")
        case List(a, b) => println("两个元素集合，【" + a + ", " + b + "】")
        case _ => println("其他情况")
      }
    }
  }
}
