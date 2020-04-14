package scala0226

import java.util.Date

/**
  * @author liuhuixu
  * @date 2020/02/26 - 19:53
  */
/**
  * 偏应用函数
  */
object pianyingyong {
  def main(args: Array[String]): Unit = {
    def log(date:Date,s:String): Unit ={
      println("date is "+date+",log is "+s)
    }
    val date = new Date()
    log(date,"log1")
    log(date,"log2")
    log(date,"log3")
    log(date,"log4")

    //想要调用log，以上变化的是第二个参数，可以用偏应用函数处理
    val logWithDate = log(date,_:String)
    logWithDate("log11")
    logWithDate("log22")
    logWithDate("log33")
  }
}
