name := "scala-starz"

version := "0.1"

scalaVersion := "2.13.1"

// TODO
// triggeredMessage := Watched.clearWhenTriggered

autoStartServer := false

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-language:implicitConversions",
  "-language:higherKinds"
)

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3")