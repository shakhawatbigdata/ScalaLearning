package set

import scala.collection.mutable.HashSet

object HashSetDemo1 {
  def main(args: Array[String]): Unit = {
    var flowers: HashSet[String] = HashSet("tulip", "rose", "lily", "lotus", "dahlia")

    // printing values 1:
    println("Values of the HashSet: " + flowers)

    // printing values 2:
    flowers.foreach((x: String) => println(x))

    // printing values 3:
    flowers.foreach(println)

    // printing values 4:
    for (flower <- flowers) {
      println(flower)
    }

    println("The size of the HashSet: " + flowers.size)
    println("The head of the HashSet: " + flowers.head)
    println("The tails of the HashSet: " + flowers.tail)

    println("jasmine has been added: " + flowers.+("jasmine"))
    println(flowers)
    println("lotus has been removed: " + flowers.-("lotus"))

    var moreFlowers: HashSet[String] = HashSet("anemone", "amaryllis", "daisy", "cosmos", "Mimosa")

    // var merged: HashSet[String] = flowers ++ moreFlowers)
    var merged: HashSet[String] = flowers.++(moreFlowers)
    println(merged)
  }
}

//object HashSetDemo1 {
//  
//}