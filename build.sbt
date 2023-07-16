val akkaDeps =
  Seq("akka-actor", "akka-actor-typed", "akka-slf4j", "akka-serialization-jackson", "akka-stream")
val scala2Deps = Map(
  "com.typesafe.akka"            -> ("2.6.21", akkaDeps),
  "com.typesafe"                 -> ("0.6.1", Seq("ssl-config-core")),
  "com.fasterxml.jackson.module" -> ("2.14.3", Seq("jackson-module-scala"))
)

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
    // Work around needed because akka-http 10.2.x is not published for Scala 3
    excludeDependencies ++=
      (if (scalaBinaryVersion.value == "3") {
        scala2Deps.flatMap(e => e._2._2.map(_ + "_3").map(ExclusionRule(e._1, _))).toSeq
      } else {
        Seq.empty
      }),
    libraryDependencies ++=
      (if (scalaBinaryVersion.value == "3") {
        scala2Deps.flatMap(e => e._2._2.map(e._1 %% _ % e._2._1).map(_.cross(CrossVersion.for3Use2_13))).toSeq
      } else {
        Seq.empty
      }),
  )
