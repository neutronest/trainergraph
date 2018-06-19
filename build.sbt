import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(List(
    organization := "com.neulab.trainer",
    scalaVersion := "2.12.3",
    version := "0.1.0-SNAPSHOT"
  )),
  name := "graph",
  libraryDependencies += scalaTest % Test,
  libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.6",
  libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.0-M23",
  libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.20.0"

)
