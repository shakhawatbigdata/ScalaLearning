package other

//object ReduceFoldScan {
//
//  // (Reduce, Fold, Scan) - Left / Right can be applied to Scala collections
//
//  def main(args: Array[String]): Unit = {
//    val numbers = List(1, 3, 5, 4, 4, 5, 6, 4, 6, 5, 7, 4, 4, 3)
//    val names = List("boston", "miami", "dallas", "hartford", "richmond")
//    val letters = List("N", "A", "M", "E")
//    val flowers: List[String] = List("rose", "lily", "daisy", "lotus", "dahlia", "tulip")
//    val str = letters.reduceLeft(_ + _)
//    println(str)
//
//    val sumOfNumbers = numbers.reduceLeft(_ + _)
//    println(sumOfNumbers)
//
//    println(numbers.reduceLeft((x, y) => { println(x + ", " + y); x + y; }));
//
//    println(numbers.reduceLeft(_ - _))
//    println(numbers.reduceRight(_ - _))
//
//    println(numbers.foldLeft(0)(_ - _))
//    println(numbers.foldLeft(5)(_ + _))
//
//    println(numbers.scanLeft(0)(_ - _))
//    println(numbers.scanLeft(5)(_ + _))
//
//    println(numbers.scanRight(0)(_ - _))
//    println(numbers.scanRight(5)(_ + _))
//
//  }
//}

//==============

//object ReduceFoldScan {
//
//  // (Reduce, Fold, Scan) - Left / Right can be applied to Scala collections
//
//  def main(args: Array[String]): Unit = {
//    val numbers = List(1, 3, 5, 4, 4, 5, 6, 4, 6, 5, 7, 4, 4, 3)
//    val names = List("boston", "miami", "dallas", "hartford", "richmond")
//    val letters = List("N", "A", "M", "E")
//    val flowers: List[String] = List("rose", "lily", "daisy", "lotus", "dahlia", "tulip")
//   
//    val str = letters.reduceLeft(_ + _)
//    println(str)
//
//    val sumOfNumbers = numbers.reduceLeft(_ + _)
//    println(sumOfNumbers)
//
//    println(numbers.reduceLeft((x, y) => { println(x + ", " + y); x + y; }));
//
//
//
//
//
//  }
//}

//==========

//object ReduceFoldScan {
//
//  // (Reduce, Fold, Scan) - Left / Right can be applied to Scala collections
//
//  def main(args: Array[String]): Unit = {
//    val numbers = List(1, 3, 5, 4, 4, 5, 6, 4, 6, 5, 7, 4, 4, 3)
//    val names = List("boston", "miami", "dallas", "hartford", "richmond")
//    val letters = List("N", "A", "M", "E")
//    val flowers: List[String] = List("rose", "lily", "daisy", "lotus", "dahlia", "tulip")
// 
//
//   
//
//    println(numbers.scanLeft(0)(_ - _))
//    println(numbers.scanLeft(5)(_ + _))
//
//    println(numbers.scanRight(0)(_ - _))
//     println(numbers.scanRight(3)(_ - _))
//    println(numbers.scanRight(5)(_ + _))
//
//  }
//}

//===========

object ReduceFoldScan {

  // Right can be applied to Scala collections

  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,5,6)
    
     println(numbers.scanRight(0)(_ - _))
  /*	0		= 0
  		6-0 = 6
  		5-6 = -1
  		4-(-1)=5
  		3-5 = -2
  		2-(-2)= 4
  		1-4 = -3
  
  
  
  */
     

  }
}

//object ReduceFoldScan {
//  
//}