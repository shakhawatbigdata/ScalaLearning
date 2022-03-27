package list


object ListDemo2 {
  def main(args: Array[String]): Unit = {

    var listOfNumbers = List(1, 2, 3, 4, 5)

    var howManyElements: Int = listOfNumbers.length

    println(howManyElements)

    var myList: List[String] = List("abc", "def", "efg")

    var anotherList = myList :+ "ghi" // adding an element
    println(anotherList)

    var added = anotherList.++("xyz")

    println(added)
    
    

    println(listOfNumbers.head) // head is the first element
    println(listOfNumbers.tail) // tail refers to the all the elements except the first one

    //   listOfNumbers.foreach(println _)   // _ is a wildcard and can be used as a placeholder for any element in a list
    //
    //    listOfNumbers.foreach((x:Int) => println(x))
  }
}
//object ListDemo2 {
//  
//}