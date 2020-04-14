package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 10:51
  */
object a_b {
  def main(args: Array[String]): Unit = {
    def fun1(a:Int,b:Int): Int ={
      a+b
    }
    def fun:(Int,Int)=>Int=(a:Int,b:Int)=>{
      fun1(10,20)
    }
    print(fun(10,20))
  }
}
