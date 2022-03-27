package list

object StreamDemo {
  def main(args: Array[String]): Unit = {
    val st = 1 #:: 2 #:: 3 #:: 4 #:: 5 #:: 6 #:: 7 #:: Stream.empty

    println(st)
    println(st.head)
    println(st.take(3))
    println("tail: "+st.tail)
    println(st.filter(_ > 3))
    println(st.map(_ * 3))

    st.foreach(println)
    println(st.max)
    println(st.min)
    println(st.sum)
    println(st.size)

    val nums = (501 to 1000).toStream
    println("map: " + nums.map { _ * 2 })

    nums.foreach((x: Int) => println(x))

    println("The length is: " + nums.length)

  }
}


//object StreamDemo {
//  
//}