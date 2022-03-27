package list

//object ListDemo3 {
//  def main(args: Array[String]): Unit = {
//
//    var listOfNumbers = List(1, 2, 3, 4, 5)
//    var myList: List[String] = List("abc", "def", "efg")
//
//    println(listOfNumbers.take(2)) // prints the first two elements // spark*
//
//    println(listOfNumbers.min)
//    println(listOfNumbers.max)
//
//    println(listOfNumbers.reverse)
//
//    println(listOfNumbers.contains(5)) // returns boolean for the value present
//
//    println(listOfNumbers.map(x => x * 5)) // spark*
//
//    println(listOfNumbers.map(x => x * x)) // spark*
//
//    println(listOfNumbers.filter(x => x < 3)) // spark*
//
//  }
//}

//===================

object ListDemo3 {
  def main(args: Array[String]): Unit = {

    var listOfNumbers = List(1, 2, 3, 4, 5)
    var myList: List[String] = List("abc", "def", "efg")



    println(listOfNumbers.min)
   
    println(listOfNumbers.map(x => x * 5)) // spark*

   println(listOfNumbers.drop(3))
   
  }
}

//object ListDemo3 {
//  
//}