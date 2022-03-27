package list

object ListDemo1 {
  def main(args: Array[String]): Unit = {

    // List is a collection object - can hold multiple values of the same type
    // List has a system of indexing to locate its elements
    // it maintains the order of the elements and it follows LIFO (last in fast out) model

    // declaring a list:

    var listOfNumbers = List(1, 2, 3, 4, 5) // 5 elements

    var myList: List[String] = List("abc", "def", "efg") // length: 3, max index = length - 1

    var anEmptyList = List() // no elements

    println(listOfNumbers) // first way of printing all the elements from a list
    println(myList)
    println(myList(1)) // a way to get a specific element from the list based on its index position
    println(listOfNumbers(3))

    listOfNumbers.foreach(println) // another way to print all the elements from a list

    // printing all the elements of a list using for loop:
    for (x <- listOfNumbers) {
      print(x + " ")
    }

  }
}

//object ListDemo1 {
//  
//}