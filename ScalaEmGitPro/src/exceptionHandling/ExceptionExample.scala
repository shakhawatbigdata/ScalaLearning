package exceptionHandling
class ExceptionExample {

  def div(x: Int, y: Int) {

    try {
      var result = x / y
      println("The value of the result is: " + result)

      var arr = Array(1, 2)
      var value = arr(10)
      println("The value of the array is: " + value)

    } catch {
      case ae: ArithmeticException => println(ae)
      case exc: Exception          => println(exc)
      case thr: Throwable          => println("found a unknown exception" + thr)
    } finally {
      println("Finaly block always executes")
    }
    println("Rest of the code is executing...")
  }
}

object ExceptionExample {
  def main(args: Array[String]): Unit = {

    var ee = new ExceptionExample()
    ee.div(100, 0)

  }
}


//object ExceptionExample {
//  
//}