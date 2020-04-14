package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 20:36
  */
object TestDemo02_list {
  def main(args: Array[String]): Unit = {
    //1 创建不可变的列表
    val list = List(1,2,3,3,5,6,7,7)
    println(list)
    //2 操作元素
    println("第一个元素"+list(0))
    println("第2个元素"+list(0))
    println("最后一个元素"+list(list.size-1))
    //3 创建集合的方法
    val list1 = 100 :: 99 :: list
    val list2= 100 :: 99 :: 88 :: Nil
    val list3 = list1 ::: list
    val list4: Seq[Any] = 100 :: 99 :: list :: Nil
    println(list1)
    println(list2)
    println(list3)
    println(list4)
  }
}
