import AssemblyKeys._

assemblySettings

name := "scratch"
 
version := "0.1"
 
scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.10" % "test",
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
    "org.hamcrest" % "hamcrest-core" % "1.3.RC2" % "test",
    "org.hamcrest" % "hamcrest-library" % "1.3.RC2" % "test"
)
