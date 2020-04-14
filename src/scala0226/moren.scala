package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:32
  */
/**
  * 包含默认参数值的函数
  * 注意：
  * 1.默认值的函数中，如果传入的参数个数与函数定义相同，则传入的数值会覆盖默认值
  * 2.如果不想覆盖默认值，传入的参数个数小于定义的函数的参数，则需要指定参数名称
  */
object moren {
  def main(args: Array[String]): Unit = {
    def fun(a:Int = 10,b:Int): Unit ={
      print(a+b)
    }
    fun(b=2)
  }
}
