package arrays

object MaxMinArray {
  def getMax(inputArray: Array[Int]): Int = {
    var maxValue: Int = inputArray(0);
    for (x <- 0 until inputArray.length) {
      if (inputArray(x) > maxValue) {
        maxValue = inputArray(x);
      }
    }
    return maxValue;
  }

  def getMin(inputArray2: Array[Int]): Int = {
    var minValue: Int = inputArray2(0);
    for (x <- 0 until inputArray2.length) {
      if (inputArray2(x) < minValue) {
        minValue = inputArray2(x);
      }
    }
    return minValue;
  }

  def main(args: Array[String]): Unit = {
    var nums = Array(12, 43, 4, 56, 78, 8, 79, 44)
    println(getMax(nums))

    println(getMin(nums))

  }
}
//object MaxMinArray {
//  
//}