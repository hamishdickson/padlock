name := "padlock"

version := "1.0"

scalaVersion := "2.11.7"

val scalazVersion = "7.1.5"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-effect" % scalazVersion,
  "org.scalaz" %% "scalaz-typelevel" % scalazVersion,
  "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test" ,
  "com.chuusai" %% "shapeless" % "2.2.5"
)

scalacOptions += "-feature"

//initialCommands in console := "import scalaz._, Scalaz._"