package arrays

/*
 * Syntax:
 * var arrayName = Array.ofDim[ArrayType](NoOfRows,NoOfColumns) or
 * var arrayName = Array(Array(element...), Array(element...), ...)
 *
 */

object MultiDimArray {
  def main(args: Array[String]): Unit = {

    var arr = Array.ofDim[Int](2, 5) // a multidimensional array

    // Assigning values to first array
    arr(0)(0) = 1
    arr(0)(1) = 3
    arr(0)(2) = 5
    arr(0)(3) = 7
    arr(0)(4) = 9

    // Assigning values to second array
    arr(1)(0) = 2
    arr(1)(1) = 4
    arr(1)(2) = 6
    arr(1)(3) = 8
    arr(1)(4) = 10

    // getting the specific item (for e.g. 8) from the 2-d array:
    println(arr(1)(3))

    // Traversing elements by using loop
    for (i <- 0 to 1) { // <----  1 means there are 2 arrays
      for (j <- 0 to 4) { // <----  4 means there are 5 elements in each array
        print(arr(i)(j) + " ")
      }
      println()
    }

    // another example:
    var arr1 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
    var arr2 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
    var arr3 = Array.ofDim[Int](2, 5)

    for (i <- 0 to 1) { // Traversing elements using loop
      for (j <- 0 to 4) {
        arr3(i)(j) = arr1(i)(j) + arr2(i)(j)
        print(arr3(i)(j) + " ")

      }
      println()
    }

  }
}

//object MultiDimArray {
//  
//}