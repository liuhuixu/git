package scala0227

import scala.collection.mutable.ListBuffer

/**
 * @author liuhuixu
 * @create 2020-02-27 18:30
 */
object List_test {
  def main(args: Array[String]): Unit = {
        val list = List[String]("hello scala","hello java","hello spark","a","abc")
        val result: List[Array[String]] = list.map(s=> s.split(" "))
        result.foreach(x=>println(x.toBuffer))
    print("----------------------------"+"\n")
    //打印列表中元素与给出数据相等的数据
        val res = list.filter(s => {
          "hello scala".equals(s)
        })
        res.foreach(println)
    print("----------------------------"+"\n")
    //打印列表中元素长度小于4的元素个数
        val i = list.count(s=>{s.length<4})
        println(i)
    print("----------------------------"+"\n")

        val list1 = ListBuffer[Int](1,2,3)
        list1.append(4,5,6)
        list1.+=:(100)
        list1.foreach(print)
    print("----------------------------"+"\n")
    print("----------------------------"+"\n")
    //1 创建不可变的列表
    val list2 = List(1,2,3,3,5,6,7,7)
    println(list2)
    //2 操作元素
    println("第一个元素"+list2(0))
    println("第2个元素"+list2(1))
    println("最后一个元素"+list2(list2.size-1))
    //3 创建集合的方法
    val list3 = 100 :: 99 :: list
    val list4= 100 :: 99 :: 88 :: Nil
    val list5 = list3 ::: list
    val list6: Seq[Any] = 100 :: 99 :: list :: Nil
    println(list3)
    println(list4)
    println(list5)
    println(list6)

  }
}
