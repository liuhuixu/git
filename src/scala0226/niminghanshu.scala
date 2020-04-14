package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:38
  */
/**
  * 匿名函数
  * 1.有参数匿名函数
  * 2.无参数匿名函数
  * 3.有返回值的匿名函数
  * 注意：
  * 可以将匿名函数返回给定义的一个变量
  */
object niminghanshu {
  def main(args: Array[String]): Unit = {
    //有参匿名函数
    val value1 = (a:Int) => {
      println(a)
    }
    value1(1)
    //无参匿名函数
    val value2 = ()=>{
      println("武汉加油")
    }
    value2()
    //有返回值的匿名函数
    val value3 = (a:Int,b:Int)=>{
      a*b
    }
    println(value3(7,8))
  }
}
