package scala0227

object Map_test {
  def main(args: Array[String]): Unit = {
//    val map1 = Map[String,Int](("a",1),("b",2),("c",3),("d",4))
//
//
//    val map = Map[String, Int]("a"->100,"b"->200,("c",300),("c",400))
//    val values: Iterable[Int] = map.values
//    values.foreach(println(_))
//    val keys: Iterable[String] = map.keys
//    //    keys.foreach(key=>{
//    //      val value = map.get(key).get
//    //      println(s"key = $key ,value = $value")
//    //    })
//    val value = map.get("a").getOrElse("no value")
//    println(value)

    import scala.collection.mutable.Map
    val map = Map[String,Int]()
    map.put("a",100)
    map.put("b",200)
    val res = map.filter(tp => {
      val key = tp._1
      val value = tp._2
      value == 200
    })
    res.foreach(x=>println(x))
    res.foreach(println(_))
    res.foreach(println)

  }

}
