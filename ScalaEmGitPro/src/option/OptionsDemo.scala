package option

object OptionsDemo {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10)
    val names = Map(1 -> "abedin", 2 -> "emran", 3 -> "rafi", 4 -> "shaheen")

    println(nums.find(_ > 5))
    println(nums.find(_ > 15))
    println(nums.find(_ > 15).getOrElse("a number greater than 10 could not be found!"))

    println(names.get(3))
    println(names.get(3).get) // returns the String value
    //   println(names.get(33).get) // NoSuchElementException:

    println(names.get(300).getOrElse("this is out of range"))
    println(names.get(15))

    var opt: Option[Int] = None
    var opts: Option[String] = Some("EMRAN")
    println(opt)
    println(opt.isEmpty)
    // println(opt.get)

    println(opts)
    println(opts.isEmpty)
    println(opts.get)

  }
}

//object OptionsDemo {
//  
//}