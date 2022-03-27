package functions

object HigherOrderFunctionDemo {
  // Higher Order functions: those take function as a parameter and return a function as return

  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

  def sumtotal(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  def main(args: Array[String]): Unit = {

    val sum = math(12.75, 32.25, (x, y) => x + y)
    println("sum: " + sum)

    val mul = math(15.33, 12.67, (x, y) => x * y)
    println("multiplication: " + mul)

    val min = math(15.33, 12.67, (x, y) => x min y)
    println("min: " + min)

    val max = math(15.33, 12.67, (x, y) => x max y)
    println("max: " + max)

    val sumofthree= sumtotal(2, 3, 5, (x, y) => x + y)
    println("sum total: " + sumofthree)

    val maxofthree= sumtotal(2, 3, 5, (x, y) => x max y)
    println("max of three: " + maxofthree)

    val addallthree= sumtotal(2, 3, 5, _+_)
    println("add all three: " + addallthree)
    
        val maxofthree1= sumtotal(2, 3, 5, _ max _)
    println("max of three: " + maxofthree1)

    
  }
}


//object HigherOrderFunction {
//  
//}