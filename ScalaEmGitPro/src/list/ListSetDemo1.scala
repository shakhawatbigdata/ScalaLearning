package list
import scala.collection.immutable._

object ListSetDemo1 {
  def main(args: Array[String]): Unit = {
    // declaring a listset:
    var listset = ListSet(4, 2, 8, 0, 6, 3, 45)
    listset.foreach((element: Int) => println(element + " "))

    // an empty listset:
    var listset1: ListSet[String] = new ListSet() // ListSet() is a constructor
    
    // an empty listset
    var listset2: ListSet[String] = ListSet.empty
    
    println("listset: " + listset)
    println("listset2: " + listset2)

    // adding an element: 
    listset2 += "abc"
    println("listset: " + listset)
    println("listset2: " + listset2)

  }
}


//object ListSetDemo1 {
//  
//}