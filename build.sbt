name := "rest-api-protocol"

version := "0.0.2"

organization := "net.arccode"

scalaVersion := "2.12.2"

publishTo := Some(
  Resolver.file("file", new File(Path.userHome.absolutePath + "/repo")))

publishMavenStyle := true

// 移除scala version
crossPaths := false