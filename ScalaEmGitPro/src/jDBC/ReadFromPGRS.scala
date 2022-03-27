package jDBC

import java.sql.DriverManager
import java.sql.Connection

object ReadFromPGRS {
  def main(args: Array[String]) {
    val driver = "org.postgresql.Driver"
    val url = "jdbc:postgresql://localhost:5432/testdb"
    val username = "postgres"
    val password = "mypwd"
    var connection: Connection = null
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT id, last_name, department, job_title FROM emps")
      while (resultSet.next()) {
        val i = resultSet.getString(1)
        val ln = resultSet.getString(2)
        val d = resultSet.getString(3)
        val t = resultSet.getString(4)

        println(i + " " + ln + " " + d + " " + t)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }

}
//object ReadFromPGRS {
//  
//}