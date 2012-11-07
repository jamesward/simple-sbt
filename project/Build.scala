import sbt._
import sbt.Keys._

object HelloBuild extends Build {
  lazy val root = Project(
    "simple-sbt",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(
      organization := "com.jamesward",
      name := "simple-sbt",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0-RC2"
    )
  )
}
