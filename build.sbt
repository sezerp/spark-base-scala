name := "cov-19"

version := "0.1"

scalaVersion := "2.12.8"

val sparkVersion = "2.4.5"
val spark = Seq(
  "org.apache.spark" %% "spark-core",
  "org.apache.spark" %% "spark-sql"
).map(_ % sparkVersion)

val configDependencies = Seq(
  "com.github.pureconfig" %% "pureconfig" % "0.12.2"
)

val baseDependencies = Seq(
  "io.monix" %% "monix" % "3.1.0",
  "com.softwaremill.common" %% "tagging" % "2.2.1",
  "com.softwaremill.quicklens" %% "quicklens" % "1.4.12"
)

val loggingDependencies = Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
)

libraryDependencies ++= spark ++ configDependencies ++ baseDependencies ++ loggingDependencies