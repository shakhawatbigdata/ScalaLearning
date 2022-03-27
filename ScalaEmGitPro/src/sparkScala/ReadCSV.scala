package sparkScala
/*
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd._
import org.apache.spark.sql._

object ReadCSV {
  def main(args: Array[String]): Unit = {
    var conf = new SparkConf().setAppName("Read CSV File").setMaster("local[*]")

    // val conf = new SparkConf().setAppName("TestApp").setMaster("yarn-client")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    var textRDD = sc.textFile("D:\\sample data\\customers.csv")
    //println(textRDD.foreach(println))

    var filtered = textRDD.filter(x => x!="Juan")
    println(filtered.foreach(println))

  }
} 
* 
*/
//object ReadCSV {
//  
//}