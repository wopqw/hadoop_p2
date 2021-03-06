val scalatraVersion = "2.+"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

lazy val root = (project in file(".")).settings(
  organization := "com.example",
  name := "scalatra-auth-example",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.7",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
  libraryDependencies ++= Seq(
    "org.scalatra" %% "scalatra-auth" % scalatraVersion,
    "org.scalatra" %% "scalatra" % scalatraVersion,
    "org.scalatra" %% "scalatra-json" % scalatraVersion,
    "org.scalatra" %% "scalatra-specs2" % scalatraVersion % "test",
    "org.json4s" %% "json4s-jackson" % "3.+",
    "com.typesafe.slick" %% "slick" % "3.+",
    "com.h2database" % "h2" % "1.+",
    "com.typesafe.akka" %% "akka-actor" % "2.+",
    "javax.servlet" % "javax.servlet-api" % "3.+" % "provided",
    "org.scalaj" % "scalaj-http_2.11" % "2.3.0"
  )
).settings(jetty(): _*)
