package exceptionHandling

class ExceptionExample1 {
  def checkAge(age: Int) = {
    if (age < 18)
      throw new ArithmeticException("You are not eligible")
    else println("You are eligible")
  }
}

object ExceptionExample2 {
  def main(args: Array[String]) {
    var obj = new ExceptionExample1()
    obj.checkAge(10)

  }
}  
//object ExceptionExample2 {
//  
//}