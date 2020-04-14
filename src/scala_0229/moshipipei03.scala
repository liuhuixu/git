package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 18:15
 */
object moshipipei03 {
  def main(args: Array[String]): Unit = {
    for (c <- "Java1234+") {
      c match {
        case _ if c.isUpper => println("这是大写字母" + c)
        case ch if ch.isLower => println("这是小写字母" + ch)
        case _ if c.isDigit => println("这是数字" + c)
        case _ => println("这是什么？")
      }
    }
  }
}
