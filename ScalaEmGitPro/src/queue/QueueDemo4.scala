package queue

import scala.collection.mutable.Queue

object QueueDemo4 {
  def main(args: Array[String]): Unit = {

    // empty queues:
    var stringQueue: Queue[String] = Queue()
    var intQueue: Queue[Int] = Queue()

    println(stringQueue)
    println(intQueue)

    var flowers: Queue[String] = Queue("lily", "rose", "tulip", "dahlia", "jasmine")
    flowers.foreach(print _)
    println("Before enqueue: " + flowers)
    flowers.enqueue("tuberose")
    println("After enqueue: " + flowers)
    flowers.dequeue()
    println("After dequeue: " + flowers)

    var numbers: Queue[Int] = Queue(4, 6, 1, 3, 5, 8, 9, 7, 10, 2, 3, 5, 8, 9)
    println(numbers)
    println("The head of the numbers queue: " + numbers.head)
    println("The tail of the numbers queue: " + numbers.tail)

    println("the max value: " + numbers.max)
    println("the min value: " + numbers.min)
    println("the sum of values: " + numbers.sum)
    println("the distinct values: " + numbers.distinct)
    var animal1: Queue[String] = Queue("lion", "camel", "deer", "bear", "fox")
    animal1.+=("gator") // append
    animal1.+=("goat", "cow") // append
    animal1.++=(Queue("tiger", "llama", "vicuna"))
    println("Final animal1: " + animal1)

    animal1.+=:("dalmatian") // prepend

    println("Final animal1 with dalmatian prepended: " + animal1)

    val nums: Queue[Int] = Queue(1, 2, 4, 6, 5, 7, 9)

    nums.filter(x => x < 5).foreach(println _)
    nums.map(x => x * x).foreach(println _)

  }
}


//object QueueDemo4 {
//  
//}