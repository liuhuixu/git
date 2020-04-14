package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 17:54
 */
object moshipipei01 {
  def main(args: Array[String]): Unit = {
    val map = Map("one" -> 1, "Two" -> 2)
    //判断集合中是否存在此元素
    val t: Option[Int] = map.get("three")
    println(t.getOrElse("不存在"))

    val o: Option[Int] = new Some(10)
    o match {
      case  None => println("没有值")
      case a:Option[Int] => println("Int类型的")
      case _=> println("没有匹配上")
    }
  }

}
