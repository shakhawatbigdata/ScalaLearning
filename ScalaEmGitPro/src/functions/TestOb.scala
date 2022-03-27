package functions


class ScalaDef {
  def add(x: Int, y: Int): Int = {
    return x + y; // return keyword can be avoided because
  }

  // shortest form:
  def multiply(x: Int, y: Int): Int = x * y // with return type
  def div(x: Double, y: Double) = x / y // without return type
}

object My {
  def sub(x: Double, y: Double) = x - y
  def sq(x: Int) = x * x
}

object TestOb {
  def main(args: Array[String]): Unit = {
    var o = new ScalaDef
    println(o.add(123, 321)) // defs inside a class require object
    println(o.multiply(100, 321))
    println(o.div(10, 4))
    println(My.sub(125, 25)) // My object doesn't need a constructor and can be referenced directly
    println(My.sq(3)) // also the following line gives simiar output
    println(My sq 9)

  }
}


//object TestOb {
//  
//}