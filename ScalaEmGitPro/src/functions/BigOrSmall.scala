package functions

import java.util.Scanner
object BigOrSmall {

  def bos(x: Int, y: Int) {
    val sc = new java.util.Scanner(System.in)
    println("Enter number x: ")
    val x = sc.nextInt();
    println("Enter number y: ")
    val y = sc.nextInt()

    if (x > y) {
      println("x is greater than y")
    } else if (x < y) {
      println("y is greater than x")
    } else {
      println("they are the same")
    }
  }

  def main(args: Array[String]): Unit = {
    bos(12, 15)
  }

}

//object BigOrSmall {
//  
//}