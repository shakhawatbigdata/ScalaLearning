package zPractice

object Functions {
  def add(x: Int=0, y : Int=0) : Int={  // 0 is default value
  return x + y;
  }
  
  def subtract(x: Int, y : Int): Int={
  x - y;
  }
  
 
  //MAIN
  def main(args: Array[String]): Unit = {
    println(add(10))
    println(multiply(10,5))
    
  }
  
   def multiply(x: Int, y : Int):Int= x * y;
  
   def division(x: Int, y : Int)= x / y;
  

  
  
}