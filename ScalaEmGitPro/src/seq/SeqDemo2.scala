package seq

import scala.collection.immutable._
object SecDemo2 {
  def main(args: Array[String]): Unit = {
    // declaration of a Seq:
    var seq = Seq(12, 3, 34, 4, 5)
    var seq1: Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 1, 7, 1)
    println(seq1)
    seq1.foreach((x: Int) => println(x))

    // add an element to Sequence using :+
    var seq2 = seq1 :+ 11
    seq2.foreach((x: Int) => print(x + " "))

    println()
    var seq3 = seq2 ++ Seq[Int](101, 102, 103)
    seq3.foreach((x: Int) => print(x + " "))
    println()

    // an empty Seq
    var seq4 = Seq[Int]()
    seq4.foreach((x: Int) => print(x + ""))
    println(seq4)
  }
}

//object SeqDemo2 {
//  
//}