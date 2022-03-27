package map

object MapDemo1 {
  def main(args: Array[String]) {
    var abc = Map((1, "Apple"), (2, "Ball"), (3, "Cat"))
    var abcd = Map(1 -> "Aple", 2 -> "Ball", 3 -> "Cat", 4 -> "Doll")
    var emptyMap: Map[String, String] = Map.empty[String, String]
    println(abc)
    println(abcd)

    println(abc.keys)
    println(abc.values)

    // accessing element by key
    println(abc(1))

    // adding an element
    var abcde = abcd + (5 -> "Elephant")
    println(abcde)

    // removing an element by key
    var eRemoved = abcde - (5)
    println(eRemoved)

    println("Empty Map: " + emptyMap)

  }
}  

//object MapDemo1 {
//  
//}