package tuple

object TupleDemo1 {
  def main(args: Array[String]): Unit = {

    var tup = ()
    var tup1 = (1, 5, 8, 6, 4, 2, 9, 10, 3, 7)
    var tup2 = ("Apple", "Banana", "Gavava", "kiwi", "lime", "lemon", "orange")
    var tup3 = (2.5, 8.4, 10.50, 3.141, 2.74, 2.121)
    var tup4 = (1, 2.5, "usa", "uk", "uae", "dr")

    println(tup)
    println(tup1)
    println(tup2)
    println(tup3)
    println(tup4)

    println("the second value: " + tup1._2)

    tup1.productIterator.foreach(println)
    
    
    // Tuple with number of elements, for example Tuple1 holds just one element:
    
    val one = Tuple1(1, 10)
    val Two = (1,2,3,4,5)
    
    val a = Tuple2(1, "abc")
    val b = Tuple5("we", "are", "happy", "boys", "forever")
    
    println(one)
    println(Two)

  }
}

//object TupleDemo1 {
//  
//}