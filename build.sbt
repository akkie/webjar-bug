import play.PlayScala

name := "webjar-bug"

version := "0.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "bootstrap" % "2.2.1"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
