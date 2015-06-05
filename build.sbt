name := "multi-play-java"

scalaVersion in ThisBuild := "2.11.5"

lazy val lib = project.in(file("lib"))

lazy val service = project.in(file("service"))
  .dependsOn(lib)
  .enablePlugins(PlayJava)

lazy val ui = project.in(file("ui"))
  .dependsOn(lib)
  .enablePlugins(PlayJava)
