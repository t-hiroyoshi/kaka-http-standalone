name := "akka-http-standalone"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-Xlint")

assemblyOutputPath in assembly := file("./akka-http-standalone.jar")

libraryDependencies ++= {
  val akkaV = "2.4.2"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-xml-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaV
  )
}

Revolver.settings
