package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:57
  */
/**
  * 高阶函数
  * 函数的参数是函数		或者函数的返回是函数		或者函数的参数和返回都是函数
  */
//函数的参数是函数

object gaojiehanshu {
  def main(args: Array[String]): Unit = {
    def fun (f:(Int,Int) =>Int, a:Int ):Int={
      f(a,100)
    }
    def f(v1:Int,v2:Int): Int ={
      v1+v2
    }
    println(fun(f,1))
    //函数的返回值是函数
    //1234相加
    def fun1(a:Int,b:Int):(Int,Int)=>Int = {

      def f2(v1:Int,v2:Int):Int={
      v1+v2+a+b
      }
      f2
    }
    println(fun1(1,2)(3,4))
    //函数的参数是函数,函数的返回值是函数
    def fun3(f:(Int,Int) => Int) : (Int,Int)=>Int = {
      f
    }
    println(fun3(f)(100,200))
    println(fun3((a,b)=>{a+b})(200,200))
    //以上这几句话还可以写成这样
    //如果函数的参数在方体中只使用了一次,那么可以用_表示
    println(fun3(_+_)(200,200))
  }
}
