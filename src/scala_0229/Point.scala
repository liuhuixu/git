package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 18:16
 */
class Point {
  var x:Int=_
  var y:Int=_
  def this(x:Int,y:Int){
    this()
    this.x=x
    this.y=y
  }
  def dis(p1:Point,p2:Point)={
    math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y))
  }
  override def toString = s"x=$x,y=$y"
}
object Point {
  def apply(a: Int, b: Int): Point = new Point(a, b)

  def main(args: Array[String]): Unit = {
    val p1: Point = Point(20, 100)
    println(p1)

    val p2 = Point(4, 8)
    val p = Point(1, 2)
    val d = p.dis(p1, p2)
    println(d)
  }
}
