package set

import scala.collection.mutable._

object SetDemo {
  def main(args: Array[String]): Unit = {

    val names = Set("boston", "miami", "dallas", "hartford", "richmond")
    val names1 = Set("weka", "plano", "irving", "wylie", "allen")

    println(names)
    val flowers: Set[String] = Set("rose", "lily", "daisy", "lotus", "dahlia", "tulip", "lotus", "dahlia", "tulip")
    println(flowers)

    val emptySet = Set()

    println(emptySet)
    println(emptySet.isEmpty)

    println("Head: " + names.head)
    println("Tail: " + names.tail)
    println("Size: " + names.size)
    println("Size: " + names.last)

    val nums = Set(1, 34, 65, 67, 78, 433, 76, 3, 45, 77, 85, 5, 456, 23)
    println(nums.size)
    println(nums.sum)
    println(nums.max)
    println(nums.min)

    val allnames = names ++ names1
    println("All city names: " + allnames)

    println(allnames.contains("weca"))
    allnames += "frisco"
    println("Frisco added: " + allnames)

    allnames -= "wylie"
    println("Wylie removed: " + allnames)

    for (city <- allnames) {
      println(city)
    }

    allnames.foreach((x: String) => println(x))

    val ob1 = Set("ball", "doll", "all", "call")
    val ob2 = Set("fall", "roll", "call", "hall")

    println("Returns the item common in both the sets: " + ob1.intersect(ob2))
    println("Returns all common items from both the sets: " + ob1.union(ob2))

    var numbers: SortedSet[Int] = SortedSet(5, 8, 1, 2, 9, 6, 4, 7, 2)
    numbers.foreach("A set soreted: " + ((element: Int) => println(element)))

  }
}

//object SetDemo {
//  
//}