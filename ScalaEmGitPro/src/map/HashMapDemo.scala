package map

import scala.collection.immutable.HashMap

object HashMapDemo {
  def main(args: Array[String]): Unit = {
    val emptyHm = HashMap();

    println("Is emptyHm empty: " + emptyHm.isEmpty)

    val hm = HashMap(1 -> "first", 2 -> "second", 3 -> "third", 4 -> "fourth", 5 -> "fifth", 6 -> "sixth")
    println(hm)
    println(hm(1))
    hm.foreach(println)
    hm.keySet.foreach((x: Int) => println(x))
    hm.values.foreach((x: String) => println(x))

    println("The head is: " + hm.head)
    println("The tail is: " + hm.tail)

    // iterating elements:
    hm.foreach {
      case (key, value) => println(key + " = " + value)
    }

    var newhm = hm + (7 -> "seventh")
    println(newhm)

    // adding and removing an element:
    newhm.+=(15 -> "fifteenth")
    newhm.-=(15)

    val another = HashMap(8 -> "eighth", 9 -> "ninth", 10 -> "tenth")

    val merged = newhm ++ another; // also:  newhm.++=(another)
    println("Merged HashMaps: " + merged)

    // printing keys and values:
    merged.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + merged(i))
    }

    // printing keys and values:
    merged.foreach {
      case (key, value) =>
        println(key);
        println(value)
    }

    // printing keys and values:
    for ((k, v) <- merged) {
      println(k + " ->" + v)
    }

    // printing keys:
    for (i <- merged.keySet) {
      println("Key: " + i)
    }

    // printing values:
    for (v <- merged.values) {
      println("Values: " + v)
    }

    if (merged.contains(8)) {
      println("The key 8 exists with value : " + merged(8))
    } else {
      println("The key 8 does not exist")
    }

    println("How many keys? " + merged.values.size)
    println("How many values? " + merged.keySet.size)

    // not for immutable HM:   merged.clear() merged.remove(8)

    println(merged.keySet.filter(_ > 5))

    println("Max key : " + merged.keySet.max)
    println("Min key : " + merged.keySet.min)
    println("Last key : " + merged.keySet.last)
    println("Last value : " + merged.values.last)

    println("Values as Strings : " + merged.values.mkString(" "))
    merged.keys.foreach(println _)
    merged.keySet.foreach(println _)
    merged.values.foreach(println _)
    println("Keys as String : " + merged.keySet.mkString(" "))

  }
}

//object HashMapDemo {
//  
//}