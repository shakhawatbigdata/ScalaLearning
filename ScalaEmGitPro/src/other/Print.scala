package other

object Print {

  def main(args: Array[String]): Unit = {
    // println function:
    var greetings = "Hello"
    println("Hello with a trailing new line: " + greetings)

    // println function of Console object:
    Console.println("World")

    // print function with no trailing new line:
    print("ABC with no trailing new line: " + "ABC")
    print("123 with no trailing new line: " + 123)
    println("has a trailing new line")

    var aNumber = 12345
    // printf() prints a formatted  with no trailing new line:
    printf("Number = %d", aNumber)
    printf("Number = %d", aNumber)
  }
}

//object Print {
//}