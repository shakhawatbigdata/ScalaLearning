package arrays
// ==METHOD   .reduceLeft()
object MaxMinValuesArray {
  def getMax(inputArray: Array[Int]): Int = {
    return inputArray.reduceLeft(_ max _)
  }

  def getMin(inputArray: Array[Int]): Int = {
    return inputArray.reduceLeft(_ min _)
  }

  def main(args: Array[String]): Unit = {
    var nums = Array(12, 43, 4, 56, 788, 79, 44)
    println(getMax(nums))
    println(getMin(nums))

  }
}