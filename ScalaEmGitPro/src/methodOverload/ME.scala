package methodOverload

class MethodOverloading2 {

  def sum(x: Int): Int = {

    var result = x + x
    return result
  }

  def sum(x: Int, y: Double): Double = {
    var result = x + y
    return result
  }

}

object ME {

  def main(args: Array[String]): Unit = {
    var me2 = new MethodOverloading2()
    println(me2.sum(25))
    println(me2.sum(25, 12.75))

  }
}

//object ME {
//  
//}