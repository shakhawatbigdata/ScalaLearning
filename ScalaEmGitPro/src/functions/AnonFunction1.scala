package functions

import java.util.Date

object AnonFunction1 {

  def log(date: Date, message: String) = {
    println(date + "  " + message)
  }

  def main(args: Array[String]): Unit = {

    // fully-applied function:
    val sum = (x: Int, y: Int, z: Int) => x + y + z
    println(sum(10, 20, 30))

    // partially-applied function:
    val paf1 = sum(11, 22, _: Int)
    println(paf1(100))

    val paf2 = sum(11, _: Int, _: Int)
    println(paf2(333, 444))

    val date = new Date
    val myLog = log(date, _: String)

    while (true) {
      val date = new Date
      val myLog = log(date, _: String)
      println(myLog("the time is: "))
      Thread.sleep(1000)
     
    }
    
  }
}

//object AnonFunction1 {
//  
//}