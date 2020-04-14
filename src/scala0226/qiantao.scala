package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:43
  */
/**
  * 嵌套方法
  * 例如：嵌套方法求5的阶乘
  */
object qiantao {
  def main(args: Array[String]): Unit = {
    def fun1(num:Int) ={
      def fun2(a:Int,b:Int):Int ={
        if(a == 1){
          b
        }else{
          fun2(a-1,a*b)
        }
      }
      fun2(num,1)
    }
    println(fun1(5))
  }
}
