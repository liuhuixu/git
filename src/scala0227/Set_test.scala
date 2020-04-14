package scala0227

/**
 * @author liuhuixu
 * @create 2020-02-27 18:42
 */
object Set_test {
  def main(args: Array[String]): Unit = {
    //set集合求交集
    val set = Set[Int](1,2,3,4)
    val set1 = Set[Int](3,4,5,6)
    //(1)
    val ints = set.filter(elem=>{elem>2})
        ints.foreach(println(_))
    print("----------------------------"+"\n")
    //(2)
    val res1 = set.intersect(set1)
    res1.foreach(println(_))

    print("----------------------------"+"\n")
    print("----------------------------"+"\n")
    //set集合求差集
    val res2 = set &~ set1
    res2.foreach(println(_))

    print("----------------------------"+"\n")
    print("----------------------------"+"\n")
    val res3 = set1 &~ set
    res3.foreach(println(_))
  }
}
