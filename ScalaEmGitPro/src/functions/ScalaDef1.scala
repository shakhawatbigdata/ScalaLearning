package functions

/* Syntax of a function:
 *
 * def functionName ([list of parameters]) : [return type] = {
 * function body
 * return [expr]
 * }
 *
 */

object Sample {

  def example1() { // a function without = operator and no parameter
    println("this is an example function")
  }

  def example2() = { // a function with = operator but no parameter
    var a = 10
    a // return type inferred by compiler from last expression/statement in the function
  }

  def add1(a: Int, b: Int) = {
    var c = a + b
    println(c)
  }

  def add(a: Int, b: Int): Int = { // with params and return type
    var sum: Int = 0
    sum = a + b
    return sum
  }

  def voidMethod(): Unit = { // Unit is equivalent to 'void'
    println("Hello, Scala!")
  }

  def defaultValues(a: Int = 10, b: Int = 0): Int = { // parameters with default values as 0
    a + b
  }

  def namedParamereters(firstNumber: Int, secondNumber: Int): Int = {
    firstNumber + secondNumber
  }
}


object ScalaDef1 {
  def main(args: Array[String]): Unit = {
    Sample.example1()
    println(Sample.example2())
    println(Sample.add(15, 25))
    Sample.voidMethod
    Sample.add1(100, 200)

    println(Sample.defaultValues()) // shows output with default values
    println(Sample.defaultValues(11)) // first value has been replaced with 11
    println(Sample.defaultValues(11, 22)) // both values overridden the default values

    // namedParameter examples:
    var result1 = Sample.namedParamereters(firstNumber = 15, secondNumber = 2) // Parameters names are passed during call
    var result2 = Sample.namedParamereters(secondNumber = 15, firstNumber = 2) // Parameters order have changed during call
    var result3 = Sample.namedParamereters(15, 2) // Only values are passed during call
    println(result1)
    println(result2)
    println(result3)
  }
} 

//object ScalaDef1 {
//}