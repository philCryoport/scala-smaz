name := "scala-smaz"

version := "1.0.2"

scalaVersion := "2.11.12"

publishMavenStyle := true

publishArtifact in Test := false

resolvers += Resolver.mavenLocal

packageBin in Compile := file(s"target/scala-2.11/${name.value}-assembly-1.0.2.jar")

pomIncludeRepository := { _ => false }

organization := "com.scalableminds"

organizationName := "scalable minds UG (haftungsbeschränkt) & Co. KG"

organizationHomepage := Some(url("http://scalableminds.com"))

startYear := Some(2015)

description := "A small library to compress short strings using a dictionary lookup method."

licenses := Seq("MIT" -> url("https://github.com/tmbo/scala-smaz/blob/master/LICENSE"))

homepage := Some(url("https://github.com/tmbo/scala-smaz"))

scmInfo := Some(ScmInfo(url("https://github.com/tmbo/scala-smaz"), "https://github.com/tmbo/scala-smaz.git"))


pomExtra := (
  <developers>
    <developer>
      <id>tmbo</id>
      <name>Tom Bocklisch</name>
      <email>tom.bocklisch@scalableminds.com</email>
      <url>http://github.com/tmbo</url>
    </developer>
  </developers>
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.7.3" % "test",
  "org.apache.logging.log4j" % "log4j-api" % "2.20.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.20.0"
)

exportJars := true
isSnapshot := true

crossPaths := true

