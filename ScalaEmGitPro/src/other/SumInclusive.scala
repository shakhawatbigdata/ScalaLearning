package other

object SumInclusive {
  def main(args: Array[String]): Unit = {

    var numList = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    var sum = 0;
    for (i <- 0 to (numList.length - 1)) {
      sum += numList(i);
    }
    println(sum)
  }
}

//object SumInclusive {
//  
//}