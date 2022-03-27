package writeFile

import java.io.PrintWriter
import java.io.File

/*
 For Write File Properties>Security should be like::
 Authentication:: Allow all(Except Full control)
  SYSTEM:: Allow all
  Administrators:: Allow all
  Users :: Allow Read&execute AND Write
  */

object WriteAFile {
    def main(args: Array[String]): Unit = {
   
    val writer = new PrintWriter(new File("D:\\test1.txt"))


    for (i <- 1 to 20) {
      writer.write(i + ": Hello Hossain\n")

    }
//=====================

    writer.close()

  }
}

//=======================
//object WriteAFile {
//    def main(args: Array[String]): Unit = {
//   
//    val writerr = new PrintWriter(new File("D:\\aaa.txt"))
//
//   
////=====================
//    for (j <- 1 to 20) {
//      writerr.write(j + ": Hello S\n")
//
//    }
//    
// writerr.close()
//  }
//}

//object WriteAFile {
//}