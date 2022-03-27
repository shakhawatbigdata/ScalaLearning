package map

object MapDemo {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val mp = Map(1 -> "first", 2 -> "second", 3 -> "third", 4 -> "fourth", 5 -> "fifth", 6 -> "sixth")

    list.map(_ * 5).foreach(println)
    list.map(x => x * 5).foreach(println)

    list.map(x => x + " number: " + x).foreach(println)
    list.map(x => x + " hi: " * x).foreach(println)

    mp.map(x => "anything" + x).foreach(println)

    println("hello".map(_.toUpper))
    println(List(List(1, 3, 5, 7, 9), List(2, 4, 6, 8, 10)));
    println(List(List(1, 3, 5, 7, 9), List(2, 4, 6, 8, 10)).flatten);

    var myList = List(10, 20, 30, 40, 50, 60)

    println(myList.map(x => x + 3))

    var bList = List(22, 33, 44, 55, 66, 77)
    println(bList.map(x => List(x + 2)))
    println(bList.flatMap(x => List(x + 2)))

    println("Filtered by even: " + (list.filter(x => x % 2 == 0)))
    println("Filtered by odd: " + (list.filter(x => x % 2 != 0)))

  }

}


//object MapDemo {
//  
//}