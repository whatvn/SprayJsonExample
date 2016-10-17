name := "JsonExample"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {

  val scalaTestV = "3.0.0"
  val sprayJsonV = "1.3.2"
  Seq(
    "org.scalatest" % "scalatest_2.11" % scalaTestV % "test",
    "io.spray"            %%  "spray-json" % sprayJsonV
  )
}