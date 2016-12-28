name := "Graph-Redis"

version := "20161228"

scalaVersion := "2.11.7"

organization := "se.kodiak.tools"

credentials += Credentials(Path.userHome / ".ivy2" / ".tools")

publishTo := Some("se.kodiak.tools" at "http://yamr.kodiak.se/maven")

publishArtifact in (Compile, packageSrc) := false

publishArtifact in (Compile, packageDoc) := false

resolvers += "se.kodiak.tools" at "http://yamr.kodiak.se/maven"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "com.github.etaty" %% "rediscala" % "1.7.0"

libraryDependencies += "se.kodiak.tools" %% "graph" % "20161228"
