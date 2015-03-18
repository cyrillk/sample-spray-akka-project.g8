name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  Seq(
    "org.scalaz" %% "scalaz-core" % "7.1.1" withSources() withJavadoc(),
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test"
    "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
    "org.specs2" %% "specs2-core" % "3.0.1" % "test",
    "org.mockito" % "mockito-core" % "1.10.19" % "test"
    // "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  )
}

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

scalacOptions in Test ++= Seq("-Yrangepos")

initialCommands := "import $organization$.$name;format="lower,word"$._"

