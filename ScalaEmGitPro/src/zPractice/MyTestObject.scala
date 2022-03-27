package zPractice

object MyTestObject {
  def main(args: Array[String]): Unit = {
    var myName = MyTestObject.myFunc("Shahed")
    println(MyTestObject.f(10))

  }

  def myFunc(name: String) {
    var name = "Sagor"
    println(name)
  }

  def f(x: Int, y: Int = 0) = x + y;
}