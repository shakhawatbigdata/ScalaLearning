package arrays

class ArrayTest {

  def showArrayValues(arr: Array[Character]) {
    for (a <- arr) // Traversing array elements
      print(a + " ")
    println("The 3rd element is: " + arr(2)) // accessing 3rd element elements using index 2
  }
}

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    // a single-dimensional array
    var arr: Array[Int] = Array(1, 2, 3, 4, 5)

    // Traversing through array elements:
    for (a <- arr) {
      println(a)
    }

    // a single-dimensional array with defined size, output: 5 zeros
    var anarr = new Array[Int](5)
    for (a <- anarr) {
      println(a)
    }

    anarr(0) = 10
    anarr(1) = 20
    anarr(2) = 30
    anarr(3) = 40
    anarr(4) = 50
    // traversing through array after adding element values:
    for (a <- anarr) {
      println(a)
    }

    // Iterating by foreach Loop:
     anarr.foreach((x:Int)=>println(x + " ")) 
    
    
    var ca: Array[Character] = Array('a', 'c', 'd', 'e', 'f')

    var at = new ArrayTest
    at.showArrayValues(ca)

  }
}

//object ArrayDemo1 {
//  
//}