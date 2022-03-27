package other

import scala.io.Source

object ReadFileContent {
  def main(args: Array[String]) {
    println("Following is the content read:")
    Source.fromFile("C:\\Users\\Desktop\\output\\Test.txt").foreach(print)
  }
}

//object ReadFileContent {
//  
//}