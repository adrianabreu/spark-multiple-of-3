import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "multiple-of-3",
    scalaVersion := "2.11.0",
    organization := "com.example",
    version := "1.0.0"
  )
  .settings(
    Dependencies.dependencies: _*
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
