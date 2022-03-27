package queue

import scala.collection.mutable._

object QueueDemo2 {
  def main(args: Array[String]): Unit = {
    var q1 = Queue(1, 34, 5, 6, 65, 76, 78, 7)
    println(q1)

    val sumTotal = q1.sum

    val minValue = q1.min
    println("Min value: " + minValue)

    val maxValue = q1.max
    println("Max value: " + maxValue)

    println(q1)
    println(sumTotal)
    q1.clear()

    val qn = Queue("new", "york")
    val result = qn.+=("city")
    println(result)

    val city = Queue("boston", "dallas")
    val cities = city.+=:("houston")
    println(cities)
    println(cities.tail)
    println(cities.head)
    println(cities.front)

    val numbers = Queue(1, 2, 3, 4, 5)
    val res = numbers.:+(10)
    print(res)

    val flower = Queue("lily", "rose")
    val flowers = q1.:+("tulip")
    print(flowers)

  }
}

//object QueueDemo2 {
//  
//}