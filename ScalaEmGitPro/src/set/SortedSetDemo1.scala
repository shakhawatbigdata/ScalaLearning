package set

import scala.collection.immutable.SortedSet

object SortedSetDemo1 {
  def main(args: Array[String]): Unit = {
    // declaring an immutable SortedSet
    var ss = SortedSet("aziz", "arman", "sammy", "akash", "kalam", "aziz", "arman")
    println(ss)

    for (i <- ss.to[List].reverse)
      print(i + " ")

    val sSet = SortedSet(1, 2, 6, 5, 8, 7, 3, 4, 6, 7, 2, 4, 3, 4, 3, 5, 8, 93, 5, 23)
    print(sSet)
    print(sSet.foldLeft(List[Int]())((x, y) => y :: x))

    // empty ss
    val emptySortedSet: SortedSet[String] = SortedSet.empty[String]

    // foreach:
    ss.foreach(println)
    //    ss.foreach(println _)
    //    ss.foreach((x:String)=>(println(x)))

    // for loop:
    for (i <- ss)
      println(i)

    // size:
    println(ss.size)

    // contains:
    println(ss.contains("kalam"))

    // first two elements:
    println(ss.take(2))

    // contains "arman"
    println("contains arman: " + ss("arman"))

    // ss.sum  - since its an String collection
    println("max: " + ss.max)
    println("min: " + ss.min)

    // isEmpty:
    println(ss.isEmpty)

    println("last key: " + ss.lastKey)

    // head and tail:
    println(ss.head)
    println(ss.tail)

    // adding an element:
    println(ss.+("tanzir"))

    // removing an element:
    println(ss.-("sammy"))

    var ss1 = SortedSet("mizan", "faisal", "tapashi")
    var ss2 = SortedSet("yasmin", "dilruba", "sharmin")

    // adding multiple SortedSets together:
    println(ss.++(ss1).++(ss2))

  }
}

//object SortedSetDemo1 {
//  
//}