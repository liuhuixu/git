package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:34
  */
/**
  * 可变参数个数的函数
  * 注意：多个参数逗号分开
  */
object kebiancanshu {
  def main(args: Array[String]): Unit = {
    def fun(elements: Int*): Int ={
      var sum = 0;
      for(elem <- elements){
        sum += elem
      }
      sum
    }
    println(fun(1,2,3,4))
  }
}
