package map

import scala.collection.mutable.ListMap

object ListMapDemo {
  def main(args: Array[String]): Unit = {
    val lm = ListMap(7 -> "seventh", 5 -> "fifth", 1 -> "first", 2 -> "second", 3 -> "third")
    println(lm)

    println("The first value: " + lm.get(1))

    println("The first value: " + lm(1))

    // printing keys and values:
    for ((k, v) <- lm) {
      println(k + " = " + v)
    }

    // printing keys and values:
    lm.foreach {
      case (key, value) => println(key); println(value)
    }

    // printing keys:
    lm.keySet.foreach(println _)

    // printing keys and values:
    lm.values.foreach(println _)

    println(lm.size)
    println(lm.keySet.size)
    println(lm.values.size)

    println(lm.head)
    println(lm.tail)
    println("Max: " + lm.max)
    println("Max: " + lm.keySet.max)
    println("Min: " + lm.min)
    println("Min: " + lm.keySet.min)

    lm.+=(6 -> "sixth")
    println("After adding 6th: " + lm)

    lm.-=(6) // only key
    println("After removing 6th: " + lm)

    val lmanother = ListMap(10 -> "tenth", 11 -> "eleventh", 13 -> "twelveth")

    lm.++=(lmanother)
    println("After merging: " + lm)
  }

}



//object ListMapDemo {
//  
//}