package queue

import scala.collection.immutable._

object QueueDemoo1 {
  def main(args: Array[String]): Unit = {
    var queue1 = Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    var queue2: Queue[Int] = Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    println(queue1)
    println(queue2)

    //traversing queue elements:
    queue1.foreach((x: Int) => print(x + " "))

    var firstElement = queue1.front
    print("\nFirst element in the queue: " + firstElement)

    var enqueueQueue = queue1.enqueue(100)
    print("\nElement added in the queue: " + enqueueQueue)

     var dequeueQueue = queue1.dequeue  
        print("\nElement deleted from this queue: "+ dequeueQueue)  

    println("\n " + queue1.isEmpty)


    for(x <- queue1){
      println(x)
    }
  }
}

//object QueueDemoo1 {
//  
//}