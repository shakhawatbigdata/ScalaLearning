package set

import scala.collection.immutable.SortedSet

object SortedSetDemo2 {
  def main(args: Array[String]): Unit = {

    var ss = SortedSet("aziz", "arman", "sammy", "akash", "kalam", "aziz", "arman")
    var ss1 = SortedSet("mizan", "faisal", "tapashi", "yasmin", "dilruba", "sharmin", "akash", "aziz")
    
    // intersection (elements common to both the SortedSets):
    println("Intersection:" + (ss & ss1))

        // intersection (elements common to both the SortedSets):
    println("Intersection:" + (ss1 &~ ss))
    
  }
}

//object SortedSetDemo2 {
//  
//}