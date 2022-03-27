package methodOverload

class MethodOverloading1 {

  def add(a: Int) {
    var sum = a + a
    println(sum)
  }

  def add(a: Int, b: Int) {
    var sum = a + b
    println(sum)
  }

  def add(a: Int, b: Int, c: Int) {
    var sum = a + b + c
    println(sum)
  }
}

object MO {
  def main(args: Array[String]) {
    var a = new MethodOverloading1();
    a.add(25)
    a.add(10, 10);
    a.add(10, 10, 10);
  }
} 

//object MO {
//  
//}