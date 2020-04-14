package scala0227

/**
 * @author liuhuixu
 * @create 2020-02-27 17:28
 */
/***
 * 求并集（10分）
 * 求交集（10分）
 * 求差集（10分）
 *
 */
object List_test1 {
  def main(args: Array[String]): Unit = {
    val a1 = List(5,6,4,7);
    val a2 = List(1,2,3,4);
//    求并集（10分）
    println(a1++a2)
//    求交集（10分）
    println(a1.intersect(a2))
//    求差集（10分）
    println(a1.diff(a2))
  }
}
