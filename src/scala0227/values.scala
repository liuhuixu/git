package scala0227

/**
 * @author liuhuixu
 * @create 2020-02-27 17:46
 */
object values {
  def main(args: Array[String]): Unit = {
    def values(fun: (Int) => Int, low: Int, high: Int): List[(Int, Int)] = {
      var array = List[(Int,Int)]()
      for(a<-low to high){
        array=(a,fun(a))::array
      }
      array
    }
    println(values(x => x * x,-5,5))
  }
}
