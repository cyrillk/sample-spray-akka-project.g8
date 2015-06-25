name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  Seq(
    "org.scalaz" %% "scalaz-core" % "7.1.3" withSources() withJavadoc(),
    // SPRAY
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "io.spray" %% "spray-json" % "1.3.1",
    "io.spray" %% "spray-testkit" % sprayV  % "test",
    // AKKA
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    // TESTING
    "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
    "org.specs2" %% "specs2-core" % "3.3" % "test",
    "org.mockito" % "mockito-core" % "1.10.19" % "test"
  )
}

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

Revolver.settings

scalacOptions in Test ++= Seq("-Yrangepos") // specs2

initialCommands := "import $organization$.$name;format="lower,word"$._"
