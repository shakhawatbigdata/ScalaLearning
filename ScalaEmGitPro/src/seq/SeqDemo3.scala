package seq

object SeqDemo3 {
  def main(args: Array[String]): Unit = {
    var empty: Seq[String] = Seq()
    println(empty)

    var names1: Seq[String] = Seq("abc", "cde", "dgfdgdg")
    var names2: Seq[String] = Seq("abc", "cde", "dgfdgdg", "abc", "cde", "dgfdgdg", "abc", "cde", "dgfdgdg")

    println("Is empty: " + names1.isEmpty)

    println("Size is: " + names1.size)

    println(names1)

    names1.foreach((x: String) => println(x + " "))
    println("The 3rd name is: " + names1(2))

    println(names1.sorted)
    println(names1.contains("cde"))

    val nameArray: Array[String] = Array()
    names1.copyToArray(nameArray)

    println("names: " + nameArray.mkString(" "))

    println("ends with dgfdgdg: " + names2.endsWith("dgfdgdg"))
    println("head of names2: " + names2.head)
    println("tail of names2: " + names2.tail)
    println("index of dgfdgdg: " + names2.indexOf("dgfdgdg"))
    println("last index of dgfdgdg: " + names2.lastIndexOf("dgfdgdg"))
    println("reversed Seq: " + names2.reverse)

  }
}

//object SeqDemo3 {
//  
//}