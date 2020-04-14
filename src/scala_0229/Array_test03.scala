package scala_0229

/**
 * @author liuhuixu
 * @create 2020-02-29 17:37
 */
object Array_test03 {
  def main(args: Array[String]): Unit = {
    //3.	定义一个String类型变量url
    // 值为http://www.baidu.com/search=周杰伦
    // 请把“周杰伦”取出赋值到name变量上
    var url = "http://www.baidu.com/search=周杰伦"
    var name = url.slice((url.indexOf("=")+1),url.length)
    println(name)
  }
}
