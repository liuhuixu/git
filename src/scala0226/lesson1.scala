package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/25 - 18:38
  */
/**
  * 1.scala的object相当于java中的单例，object中定义的全是静态的,相当于java中的工具类
  * Object不可以传参，对象要传参，使用apply方法。
  * 2.Scala中定义变量使用var，定义常量使用val ,变量可变，常量不可变.变量和常量类型可以省略不写，会自动推断。
  * 3.Scala中每行后面都会有分号自动推断机制，不用显式写出“;”
  * 4.建议在Scala中命名使用驼峰命名法
  * 5.Scala类中可以传参，传参一定要指定类型，有了参数就有了默认了构造。类中的属性默认有getter和setter方法
  * 6.类中重写构造时，构造中第一行必须先调用默认的构造 。def this(....){....}
  */
object lesson1 {
  def main(args: Array[String]): Unit = {
    val p = new Person("zhangsan", 18)
        p.sayName()

        println(p.age)
//        p.name = "lisi"
//        println(p.name)
//    val p1 = new Person("wangwu", 16, 'F')
//    println(p1.gender)
  }

  class Person(xname: String, xage: Int) {
    private var name = xname
    var age = xage
    var gender = 'M'

    def this(yname: String, yage: Int, ygender: Char) {
      this(yname, yage)
      this.gender = ygender
    }
    def sayName()={
      println("hello")
    }
  }

}
