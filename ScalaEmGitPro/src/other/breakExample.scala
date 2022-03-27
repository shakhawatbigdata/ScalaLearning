package other


//class BreakExample {
//
//}

//object breakExample {
//  import scala.util.control.Breaks._
//
//  def main(args: Array[String]): Unit = {
//
//    breakable {                  //What is this breakable
//      for (i <- 1 to 10 by 2) {
//        if (i == 7)
//          break // Break used here
//        else
//          println(i)
//      }
//    }
//
//  }
//}

//====================

object breakExample {
  import scala.util.control.Breaks._

  def main(args: Array[String]): Unit = {
      // Here, breakable is used to prevent exception
     breakable{                 
      for (i <- 1 to 20 by 2) {
        if (i == 11)
          break // Break used here
        else
          println(i)
      }
    }

  }

}




//object breakExample {
//  
//}