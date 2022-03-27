package seq

import scala.collection.immutable._
object SecDemo1 {
  def main(args: Array[String]): Unit = {
    // declaration of a Seq:
    var seq = Seq(12, 3, 34, 4, 5)

    var seq1: Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 1, 7, 1)
    println(seq1)
    seq1.foreach((x: Int) => println(x))

    // convert to an array:
    var numArray: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0) // or var numArray: Array[Int] = new Array[Int](9)
    println("empty numArray:" + numArray.mkString(" "))
    seq1.copyToArray(numArray)
    println("numArray:" + numArray.mkString(" "))

    // contains:
    print("\n" + seq1.contains(10))

    // element at 1st index position:
    print("\n" + seq1(1))

    // length:
    print("\n" + seq1.length)

    // endsWith:
    println("Ends with (2,7): " + seq1.endsWith(Seq(2, 7)))

    // head and tail:
    print("\n" + seq1.head) // print("\n" + seq1.tail)

    // index of first occurrence of 1
    print("\n" + seq1.indexOf(1))

    // index of last occurrence of 1
    print("\n" + seq1.lastIndexOf(1))

    // checks if the Seq is empty:
    print("\n" + seq1.isEmpty)

    // reverses the order of the Seq elements
    print("\n" + seq1.reverse)

    // odd or even:

    var oddOrEven = Seq(1, 2, 3, 4, 5, 6, 8, 7, 10, 9);
    println(oddOrEven)
    oddOrEven.foreach((x: Int) => println(x))

    // 1 of 2 ways to iterate a Seq:
    oddOrEven.foreach(item => {
      if (item % 2 == 0) {
        println(item + " is even")
      } else {
        println(item + " is odd")
      }
    })

    // 2 of 2 ways to iterate a Seq:
        // 1 of 2 ways to iterate a Seq:
    for (i <- oddOrEven) {
      if (i % 2 == 0) {
        println("even")
      } else {
        println("odd")
      }
    }
  }
}

//object SeqDemo1 {
//  
//}