package vector
object VectorDemo1 {
  def main(args: Array[String]): Unit = {
    val vFlower: Vector[String] = Vector("rose", "lily", "tulip", "dahlia")
    println(vFlower)
    println(vFlower.length)
    println(vFlower.size)
    println(vFlower(0))

    val appended = vFlower :+ "tube rose"
    println("An element appended : " + appended)

    val prepended = "daisy" +: appended
    println(prepended)

    val moreFlowers = Vector("camelia", "hibiscus", "magnolia", "madagascar periwinkle")

    val allFlowers = prepended ++ moreFlowers
    println(allFlowers)

    val emptyVector = Vector()
    println(emptyVector)

    val numVector: Vector[Int] = Vector(12, 54, 65, 76, 89, 53, 12)
    println(numVector.sum)
    println(numVector.min)
    println(numVector.max)

    println(numVector.apply(3))
    println(numVector.drop(0))
    println(numVector.dropRight(1))
    println(numVector.head)
    println(numVector.tail)
    println(numVector.init)
    println(numVector.last)
    println(numVector.slice(0, 5))
    println(numVector.take(2))
    println(numVector.takeRight(2))

  }
}
//object VectorDemo1 {
//  
//}