package spark

/*
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCountExample {
  def main(args: Array[String]): Unit = {

    System.setProperty("hadoop.home.dir", "C:\\winutils")
    var conf = new SparkConf().setAppName("mypractice").setMaster("local[*]")
    var sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")

    var filepath = "C:\\Users\\Emran\\Desktop\\data\\rhyme.txt"
    var textdata = sc.textFile(filepath)
    
    // steps: split the sentence into words: flatMap(), count occurrence of each word: Map()
    // reduce the words by key: reduceByKey()
    
    var fm = textdata.flatMap(line=>line.split(" "))
    var mp = fm.map(word=> (word, 1))
    var rbk = mp.reduceByKey(_ + _)
    
    rbk.collect.foreach(println)
    

  }
}
*/

//object WordCountExample {
//  
//}