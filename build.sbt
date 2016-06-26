lazy val root = (project in file(".")).
  settings(
    name := "Sample Project",
    version := "0.0",
    scalaVersion := "2.11.7",
    organization := "com.example"
  )

scalaSource in Compile := baseDirectory.value / "src/com/example"
scalaSource in Test := baseDirectory.value / "test/com/example"

libraryDependencies  ++= Seq(
  // include Scalactic and Scalatest
  "org.scalactic" %% "scalactic" % "2.2.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

// for Scalastyle
resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
