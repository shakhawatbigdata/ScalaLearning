package exceptionHandling

class ExceptionHandlingDemo {
  def div(x: Int, y: Int) {
    
    
  
    try {
      x / y
    } catch {
      case e: ArithmeticException => println(e)
    }
    println("Rest of the code is executing . . .")
  }
}

object ExceptionHandlingDemo {
  def main(args: Array[String]): Unit = {

    var ob = new ExceptionHandlingDemo()

    ob.div(100, 0)
    
    println("A tale that never ends . . . ")
  }

}

//object ExceptionHandlingDemo {
//  
//}