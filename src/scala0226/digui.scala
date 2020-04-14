package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:27
  */
/**
  * 递归方法
  * n的阶乘
  */
object digui {
  def main(args: Array[String]): Unit = {
    def fun2(num:Int): Int ={
      if(num == 1)
        num
      else
        num * fun2(num-1)
    }
    print(fun2(5))
  }
}
