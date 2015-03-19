name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.1"
  Seq(
    "org.scalaz" %% "scalaz-core" % "7.1.1" withSources() withJavadoc(),
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
    "org.specs2" %% "specs2-core" % "3.1" % "test",
    "org.mockito" % "mockito-core" % "1.10.19" % "test"
  )
}

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)

// scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

scalacOptions in Test ++= Seq("-Yrangepos")

initialCommands := "import $organization$.$name;format="lower,word"$._"

