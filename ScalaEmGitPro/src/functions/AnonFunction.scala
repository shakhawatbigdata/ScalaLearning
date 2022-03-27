package functions

object AnonFunction {

  def add(x: Int = 10, y: Int = 20): Int = {
    return x + y;
  }

  def square(x: Int) = x * x

  def printSum(x: Int, y: Int): Unit = {
    println("printSum = : " + (x + y))
  }

  def main(args: Array[String]): Unit = {
    println(AnonFunction.add())
    println(AnonFunction.add(5))
    println(AnonFunction.add(10, 20))
    println(AnonFunction.add(100, 500))
    println(AnonFunction.square(25))
    println(AnonFunction.printSum(111,222))
    
    var add = (x:Int, y:Int) => x +y;
    
    println("anonymous function: " + add(111,333))
    
    
  }

}


//object AnonFunction {
//  
//}