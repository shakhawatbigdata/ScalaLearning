package ifElse

object ConditionalStatements {
  def main(args: Array[String]): Unit = {
    // if statement:
    if (5 <= 3) {
      println("yes 5 is greater than 3")
    }

    if (4 > 3) {
      println("yes, this is true'")
    }

    if (24 != 4) {
      println("yes, this is also true'")
    }

    if (25 == (5 * 5)) {
      println("yes, 5 multiplied by 5 is 25")
    }

    val str1 = "Hello"
    val str2 = "Hello"
    if ("hello" == "HELLO") {
      println("The output is Hello")
    }
    if (str1 == str1) {
      println("The output is Hello")
    }

    if ("new york city" != "nyc") {
      println("both are NOT the same")
    }
    if ('A' != 'a') {
      println("A and a are NOT the same")
    }

    if (!false) {
      println("its true")
    }

    if (!(100 == 500)) { // (!(100==500))  is equal to (100!=500)
      println("100 and 500 can't be the same")
    }

    if ('A' == 'C') {
      println("the condition is TRUE, so the first choice")
    } else {
      println("the condition is FALSE, so the second choice")
    }
    if (!((3 * 2) == (4 + 2) && (3 * 9) == (21 + 7))) {
      println("yes, first condition is true")
    } else {
      println("first condition is false, so we get the second choice")
    }

    if ((3 * 2) == (4 * 2) || (3 * 9) == (25 + 7)) {
      println("yes, first condition is true")
    } else {
      println("first condition is false, so we get the second choice")
    }

    var usCitizen: Boolean = true
    var minAge = 15
    if (usCitizen && (minAge >= 18)) {
      println("you can vote")
    } else {
      println("you can't vote")
    }

    // nested if statement:
    if ('A' == 'A') {
      if ("Java" != "Scala") {
        println("here is our output - since both conditions are true")
      }
    }

    val nycResidency: Boolean = true
    val passedTheExam: Boolean = true
    if (nycResidency) {
      if (passedTheExam) {
        println("you are eligible to get a City job")
      }
    }

    // if else if else statement:
    var marks: Int = 75
    if (marks > 0 && marks <= 30) {
      println("F")
    } else if (marks > 30 && marks <= 40) {
      println("E")
    } else if (marks > 40 && marks <= 50) {
      println("D")
    } else if (marks > 50 && marks <= 60) {
      println("C")
    } else if (marks > 60 && marks <= 70) {
      println("B")
    } else if (marks > 70 && marks <= 80) {
      println("A-")
    } else if (marks > 80 && marks <= 90) {
      println("A")
    } else if (marks > 90 && marks <= 100) {
      println("A+")
    } else {
      println("Invalid entry, please check your mark")
    }

    val capacity = 12
    if (capacity > 0 && capacity <= 8) {
      println("small")
    } else if (capacity > 8 && capacity <= 16) {
      println("medium")
    } else if (capacity > 16 && capacity <= 21) {
      println("large")
    } else if (capacity > 21 && capacity <= 32) {
      println("Extra Large")
    } else {
      println("invalid cup capacity!")
    }

    // Scala Pattern Matching:

    val option: Int = 5
    option match {
      case 1 => println("first option has been chosen")
      case 2 => println("second option has been chosen")
      case 3 => println("third option has been chosen")
      case 4 => println("fourth option has been chosen")
      case 5 => println("fifth option has been chosen")
      case _ => println("any option other than the 5 listed above")
    }

    var rainbowColors: String = "purple"
    rainbowColors match {
      case "violet" => println("yes, its a rainbow color")
      case "indigo" => println("yes, its a rainbow color")
      case "blue" => println("yes, its a rainbow color")
      case "green" => println("yes, its a rainbow color")
      case "yellow" => println("yes, its a rainbow color")
      case "orange" => println("yes, its a rainbow color")
      case "red" => println("yes, its a rainbow color")
      case _ => println("no, its not a rainbow color")
    }

  }
}



//object ConditionalStatements {
//}