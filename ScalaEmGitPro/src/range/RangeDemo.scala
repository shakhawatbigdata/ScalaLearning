package range

//object RangeDemo {
//  def main(args: Array[String]): Unit = {
//    var range = 1 to 10
//    println(range) // prints: Range 1 to 10
//    range.foreach(println) // prints all elements in the range
//
//    var rangeEven = 2 to 10 by 3
//    rangeEven.foreach(println) // prints all even elements in the range
//
//    var rangeUntil = 1 until 10
//    rangeUntil.foreach(println)
//
//    var rangeEven1 = 2 until 10 by 2
//    rangeEven1.foreach(println)
//        //=================
//    var cRange = 'a' to 'z'
//    cRange.foreach(println)
//
//    var cRange1 = 'A' to 'Z'
//    cRange1.foreach(println)
//
//    var crangeby3 = 'A' to 'Z' by 3
//    crangeby3.foreach(println)
//              //=================
//    //    val range = Range(start, end, increment)
//    val rangeInc = Range(2, 14, 4)
//    rangeInc.foreach(println)
//
//    //    var rangedec = 5 to 1
//    //    rangedec.foreach(println)
//
//    var revrange = 10 to 1 by -1
//    revrange.foreach(println)
//
//    var revrange1 = (0 to 10).reverse
//    revrange1.foreach(println)
//
//    var set = (1 to 10).toSet
//    println(set)
//
//    var array = (1 to 15).toArray
//    println(array.mkString(" "))
//
//    var seq = (1 to 10).toSeq
//    seq.foreach(println)
//
//    var list = (1 to 10).toList
//    println(list)
//
//  }
//}

//===================

//object RangeDemo {
//  def main(args: Array[String]): Unit = {
//    var range = 1 to 10
//    println(range) // prints: Range 1 to 10
//    range.foreach(print) // prints all elements in the range
//
//    println()
//    
//    var rangeEven = 2 to 10 by 3
//    rangeEven.foreach(println) // prints all even elements in the range
//
//    var rangeUntil = 1 until 10
//    rangeUntil.foreach(print)
//
//    var rangeEven1 = 2 until 10 by 2
//    rangeEven1.foreach(println)
//
//   
//
//  }
//}

//================= 

//object RangeDemo {
//  def main(args: Array[String]): Unit = {
//    
//       var cRange = 'a' to 'z'
//    cRange.foreach(println)
//
//    var cRange1 = 'A' to 'Z'
//    cRange1.foreach(print)
//
//    println()
//    
//    var crangeby3 = 'A' to 'Z' by 3
//    crangeby3.foreach(println)
//
//  }
//}


//=================

object RangeDemo {
  def main(args: Array[String]): Unit = {
    
           //    val range = Range(start, end, increment)
    val rangeInc = Range(2, 14, 4)
    rangeInc.foreach(println)

    //    var rangedec = 5 to 1
    //    rangedec.foreach(println)

    var revrange = 10 to 1 by -1
    revrange.foreach(println)

    var revrange1 = (0 to 10).reverse
    revrange1.foreach(println)

    var set = (1 to 10).toSet
    println(set)

    var array = (1 to 15).toArray
    println(array.mkString(" "))

    var seq = (1 to 10).toSeq
    seq.foreach(println)

    var list = (1 to 10).toList
    println(list)

  }
}

//object RangeDemo {
//  
//}