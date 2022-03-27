package vector

object VectorsDemo {
  def main(args: Array[String]) {
    var games1 = Vector("acrobatics", "badminton", "chess", "diving")
    var games2 = Vector("weightlifting")
    print("Vector Elements: ")
    games1.foreach((element: String) => print(element + " "))

    // adding an element:
    var newGames = games1 :+ "marathon"
    print("\nVector Elements after adding: ")
    newGames.foreach((element: String) => print(element + " "))

    // merging two Vectors:
    var mergedVector = newGames ++ games2
    print("\nVector Elements after merging: ")
    mergedVector.foreach((element: String) => print(element + " "))

    // sorting DESC of Vector elements:
    var reverse = mergedVector.reverse // Reversing vector elements
    print("\nVector Elements after reversing: ")
    reverse.foreach((element: String) => print(element + " "))

    // sorting ASC of Vector elements:
    var sortedVector = mergedVector.sorted // Sorting vector elements
    print("\nVector Elements after sorting: ")
    sortedVector.foreach((element: String) => print(element + " "))
  }
} 

//==============================

//object VectorsDemo {
//
//  def main(args: Array[String]): Unit = {
//    // a Vector of String: with explicit declaration
//    var flowers: Vector[String] = Vector("lily", "jasmine", "lotus", "pansy", "dahlia", "rose")
//
//    // a Vector of Int: with implicit declaration
//    var nums1 = Vector(1, 3, 5, 7, 9, 11, 13)
//    var nums2 = Vector(2, 4, 6, 8, 10, 12, 14)
//
//    var emptyVector = Vector.empty
//    println(flowers)
//    var addFlowers = flowers :+ "chrysanthemum"
//    println(addFlowers)
//
//    println(nums1)
//    println(emptyVector)
//
//    //traversing elements:
//    flowers.foreach((x: String) => print(x + " "))
//    println()
//    nums1.foreach((x: Int) => print(x + " "))
//    println()
//
//    var addedVector = nums1 ++ nums2
//    println(addedVector)
//
//    val a = Vector(20, 30, 40, 10, 10, 10)
//    println("Disticnt values" + a.distinct)
//    println("Dropped from the second index: " + a.drop(2))
//    println(a.dropRight(2))
//    println(a.dropWhile(_ < 25))
//    println(a.filter(_ < 25))
//    println(a.filter(_ > 100))
//    println(a.filterNot(_ < 25))
//    println(a.find(_ > 20))
//    println(a.head)
//    println(a.headOption)
//    println(a.init)
//    println(a.intersect(Seq(19, 20, 21)))
//    println(a.last)
//    println(a.lastOption)
//    println(a.slice(2, 4))
//    println(a.tail)
//    println(a.take(3))
//    println(a.takeRight(2))
//    println(a.takeWhile(_ < 30))
//
//  }
//}

//object VectorsDemo {
//}