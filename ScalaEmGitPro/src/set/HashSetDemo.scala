package set

import scala.collection.immutable.HashSet

object HashSetDemo {
  /*HashSet is a sealed class.
   * It extends AbstractSet and immutable Set trait.
   * It uses hash code to store elements.
   * It neither maintains insertion order nor sorts the elements.
   */
  def main(args: Array[String]): Unit = {

    var empty = HashSet()
    println("An empty HashSet: " + empty)
    var hs = HashSet(1, 2, 5, 7, 8, 4, 3, 2, 2, 8, 0, 0, 3, 6, 3, 4, 5, 4, 5)
    println("Printing the HashSet: " + hs)
    println("Checks if 25 is present: " + hs(25))
    hs.foreach((x: Int) => print(x + " "))

    hs += 25 // adding 25 to the HashSet using += operator
    hs.foreach((x: Int) => print(x + " "))
    println("\nChecks if 25 is present: " + hs(25))

    hs -= 25 // removing 25 from the HashSet
    hs.foreach((x: Int) => print(x + " "))
    println("\nChecks if 25 is present: " + hs(25))

    val hs1: HashSet[Int] = hs + 33 + 34 + 35 + 36 // adding 25 to the HashSet using + operator
    println(hs1)

    // merging two HashSets
    val merged: HashSet[Int] = hs ++ hs1
    println(merged)

    // removing an element:
    val hsremoved: HashSet[Int] = merged - 36
    println("36 removed: " + hsremoved)

    // intersection:
    val inters: HashSet[Int] = hs.intersect(hs1)
    println("Intersection of 2 HashSets: " + inters)

    // union:
    val un: HashSet[Int] = hs.union(hs1)
    println("Union of 2 HashSets: " + un)

    // differences between two HashSets using &~:
    val a: HashSet[Int] = HashSet(1, 3, 5, 7, 9, 12, 14)
    val b: HashSet[Int] = HashSet(1, 3, 5, 7, 9, 10)

    println("Differences between 2 HashSets: " + (a &~ b))

  }
}

//object HashSetDemo {
//  
//}