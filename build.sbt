name := "app1"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)


fork in run := true