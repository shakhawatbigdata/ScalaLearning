package tuple

//object TupleDemo {
//
//  def main(args: Array[String]): Unit = {
//
//    // declaring a tuple of Int:
//    var numbers = (10, 25, 81)
//
//    // summing up elements of the Int tuple:
//    val sum = numbers._1 + numbers._2 + numbers._3
//    println("Sum of tuple values: " + sum)
//
//    // iterating elements using *** productIterator:
//    numbers.productIterator.foreach {
//      i => println("Value = " + i)
//    }
//    
//    
//
//    // declaring a tuple of String:
//    var fruits = ("Kiwi", "Pineapple", "Orange", "Apple", "Banana", "Gavava")
//
//    // iterating elements using productIterator:
//    fruits.productIterator.foreach(println)
//
//    // accessing element values from specified position:
//    println("The first fruit is: " + fruits._1)
//    println("The second fruit is: " + fruits._2)
//    println("The sixth fruit is: " + fruits._6)
//
//  }
//}

//==========================

object TupleDemo {

  def main(args: Array[String]): Unit = {


//====================
    // declaring a tuple of Double:
    var amounts = (214.51, 148.14, 25.169, 110.52, 14.29, 18.31, 157.15)
    
    // declaring a tuple of data types:
    var tupleExapmple = (1.19, 2.55, "USA", true, 'A', null, 2.125f, 123525546L)
    println(tupleExapmple)

    // toString concatenates all String elements of the tuple into a String
    var flowers = (" lily", " rose", " jasmine", " tulip", " lilac", " pansy", " dahlia", " lotus")
    println(flowers.toString())
    

    // swapping two elements in a tuple of String://Change position, here 
    //America was 1st and United States was in 2nd but print reverse
    val country = new Tuple2("America", "United States")
    println("Swapped Tuple: " + country.swap)
  }
}
