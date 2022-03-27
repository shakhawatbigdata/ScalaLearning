package queue

import scala.collection.mutable.Queue

object QueueDemo1 {
  def main(args: Array[String]): Unit = {
    var names: Queue[String] = Queue("boston", "dallas", "miami", "sf", "lic", "houston", "colorado") //Queue of Integer
    // names.foreach(println)
    //println(names)

    println(names.head)
    println(names.tail)

    // insert an element in the queue (enqueue):
    names.enqueue("pittsburgh")
    names.foreach(println)

    // remove an element in the queue (dequeue):
    names.dequeue()
    names.dequeue()
    names.dequeue()
    names.dequeue()
    names.dequeue()
    names.dequeue()
    names.foreach(println)

    var nums: Queue[Int] = Queue(1, 3, 5, 6, 7, 8, 8, 9) //Queue of String
    println(nums.max)
    println(nums.min)

    nums.+=(10) // adding an element
    println(nums)

    nums.+=(66, 77) // adding elements
    println(nums)

    nums.++=(Queue(20, 25, 30)) // appending all in a collection
    nums.++=(List(20, 25, 30))
    println(nums)

    nums.+=:(111) // prepend (adding) a value in front
    println("prepended: " + nums)

    println(nums.max) //max of the elements
    println(nums.min) //min of the elements
    println(nums.sum) //sum of all elements
    println(nums.distinct) //distinct values

    // map operation:
    var numbers: Queue[Int] = Queue(2, 3, 4, 5, 6, 7, 2)
    numbers.map(x => x * x).foreach(println _)

    //filter even numbers
    numbers.filter(x => x % 2 == 0).foreach(println _)

    var flowers = Queue("lily", "jasmine", "lotus", "tulip", "rose", "holy", "bely")
    flowers.foreach(println _)

    flowers.dequeue() // removes an element from the head
    flowers.foreach(print _)
    println

    flowers.dequeueFirst(_.startsWith("j")) // jasmine removed
    flowers.foreach(print _)

    println

    flowers.dequeueAll(_.length < 5)
    flowers.foreach(print _)
  }
}

//object QueueDemo1 {
//  
//}