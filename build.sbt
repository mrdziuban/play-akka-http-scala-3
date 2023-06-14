lazy val root = project.in(file("."))
  .settings(
    name := "play-scala-3",
    organization := "com.example",
    scalaVersion := "3.3.0",
    version := "0.1.0-SNAPSHOT",
    Compile / mainClass := Some("play.core.server.ProdServerStart"),
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-akka-http-server" % "2.9.0-M6",
    ),
  )
