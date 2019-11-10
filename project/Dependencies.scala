import sbt._
import sbt.Keys.libraryDependencies


object Dependencies {
  lazy val dependencies =  libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.4.4" % "provided",
    "org.apache.spark" %% "spark-sql" % "2.4.4" % "provided"
  )
}
