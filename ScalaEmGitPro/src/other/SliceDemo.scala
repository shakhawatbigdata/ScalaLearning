package other


//object SliceDemo {
//  def main(args: Array[String]): Unit = {
//    val phrase = "a cute flower on bloom"
//
//    val result = phrase.slice(2, 6)
//    println(result)
//
//    val points = List(1.5, 3.5, 10.3, 11.3)
//    println(points)
//
//    // Get slice of list:
//    val slice1 = points.slice(1, 3)
//    println(slice1)
//
//    // Get slice until end of list:
//    val slice2 = points.slice(2, points.length)
//    println(slice2)
//          //===========

//  }
//}

//===================

//object SliceDemo {
//  def main(args: Array[String]): Unit = {
//    
//    val letters = "scala"
//    val result1 = letters(0)
//    println(result1)
//
//    val result2 = letters.slice(0, 2)
//    println(result2)
//
//    // Cannot compare a char and a string.
//    println(result1 == result2)
//
//    val example = "California"
//    val firstPart = example.slice(1, 4)
//    val firstPart2 = example.substring(1, 4)
//
//    println(firstPart, firstPart2)
//    if (firstPart == firstPart2) {
//      println(true)
//    }
//          //===========
//    
//  }
//}

//================

object SliceDemo {
  def main(args: Array[String]): Unit = {

          //===========
    val data = "abcdef"
    val test = data.slice(3, 5)
    val test2 = data.substring(3, 5)

    val t1 = System.currentTimeMillis()

    for (i <- 0 to 100000000) {
      val part = data.slice(3, 5)
      if (part != "de")
        println(false)
    }

    val t2 = System.currentTimeMillis()

    for (i <- 0 to 100000000) {
      val part = data.substring(3, 5)
      if (part != "de")
        println(false)
    }

    val t3 = System.currentTimeMillis()

    println(t2 - t1)
    println(t3 - t2)

  }
}

//object SliceDemo {
//  
//}