package example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, count}

object Application {

  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession.builder
      .master("local")
      .getOrCreate();

    import sparkSession.implicits._
    val numbers = (0 to 500).toDF("value")

    numbers.groupBy(col("value") % 3 === 0).agg(count(col("value"))).show
  }
}

