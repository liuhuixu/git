package scala0226

/**
  * @author liuhuixu
  * @date 2020/02/25 - 19:08
  */
object Person {
  /**
    * 在同一个scala文件中，class名称和object名称一样时，这个类叫做对象的伴生类，这个对象叫做这个类的伴生对象，
    * 他们之间可以相互访问私有变量
    */
  val name = "zhangsanfeng"

  def main(args: Array[String]): Unit = {
    //val person = new Person("wagnwu", 10, "f")
//    println(person.age);
//    println(person.sayName())
//    println(person.gender)
    class Person(xname: String, xage: Int) {
      var name = Person.name
      val age = xage
      var gender = "m"

      def this(name: String, age: Int, g: String) {
        this(name, age)
        gender = g
      }

      def sayName() = {
        "my name is " + name
      }

    }
  }
}
