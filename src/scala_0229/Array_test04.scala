package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 17:40
 */
object Array_test04 {
  def main(args: Array[String]): Unit = {
    /**
     * 4.	使用scala进行单词统计。定义一个list里面包含如下单词（10分）
     * “hello bob hello jack hello jay hello bob”
     * “hello tom jack jack joe jim rose”
     * 分步进行单词统计并且排序
     */
    val list = List("hello bob hello jack hello jay hello bob", "hello tom jack jack joe jim rose")
    val r1: List[Array[String]] = list.map(_.split(" "))
    val list2: List[String] = list.flatMap(_.split(" "))
    println(list2)
    val stringToTuples: Map[String, List[(String, Int)]] = list.flatMap(_.split(" ")).map(x=>(x,1)).groupBy(x=>x._1)
    println(stringToTuples)
    val stringToInt: Map[String, Int] = stringToTuples.map(x=>(x._1,x._2.size))
    println(stringToInt)
    val list11: List[(String, Int)] = stringToInt.toList
    val t1: List[(String, Int)] = list11.sortBy(x=>x._2)
    println(t1.reverse)
  }
}
