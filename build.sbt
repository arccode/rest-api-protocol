name := "rest-api-protocol"

version := "0.0.2"

organization := "net.arccode"

scalaVersion := "2.12.2"

// 本地maven仓库位置
//publishTo := Some(
//  Resolver.file("file", new File(Path.userHome.absolutePath + "/repo")))
//

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) {
    Some("snapshot" at nexus + "content/repositories/snapshots")
  } else {
    Some("releases" at nexus + "service/local/staging/deploy/maven2/")
  }
}

// 移除生成构件的 scala version
crossPaths := false

publishArtifact in Test := false

pomIncludeRepository := { _ ⇒
  false
}

pomExtra in Global := {
  <url>https://github.com/arccode/rest-api-protocol</url>
   <licenses>
     <license>
       <name>MIT</name>
       <url>https://opensource.org/licenses/MIT</url>
     </license>
   </licenses>
   <scm>
     <url>git@github.com:arccode/rest-api-protocol.git</url>
     <connection>scm:git:git@github.com:arccode/rest-api-protocol.git</connection>
   </scm>
   <developers>
     <developer>
       <id>AC</id>
       <name>arccode</name>
       <url>http://www.arccode.net/</url>
     </developer>
   </developers>
}
