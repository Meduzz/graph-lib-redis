name := "Graph-Redis"

version := "20170701"

scalaVersion := "2.11.7"

organization := "se.kodiak.tools"

credentials += Credentials(Path.userHome / ".ivy2" / ".tools")

publishTo := Some("se.kodiak.tools" at "http://yamr.kodiak.se/maven")

publishArtifact in (Compile, packageSrc) := false

publishArtifact in (Compile, packageDoc) := false

resolvers += "se.kodiak.tools" at "http://yamr.kodiak.se/maven"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

libraryDependencies += "com.github.etaty" %% "rediscala" % "1.7.0"

libraryDependencies += "se.kodiak.tools" %% "graph" % "20170701"
