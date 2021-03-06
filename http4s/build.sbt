name := "http4s-example"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
	"org.http4s" %% "http4s-blazeserver" % "0.8.3",
	"org.http4s" %% "http4s-dsl" % "0.8.3",
	"org.http4s" %% "http4s-argonaut" % "0.8.3"
)

resolvers += "Bintray" at "http://dl.bintray.com/pchiusano/maven/"
