name := "padlock"

version := "1.0"

scalaVersion := "2.11.7"

lazy val scalazVersion = "7.1.5"
lazy val doobieVersion = "0.2.3"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-effect" % scalazVersion,
  "org.scalaz" %% "scalaz-typelevel" % scalazVersion,
  "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test" ,
  "com.chuusai" %% "shapeless" % "2.2.5",
  "org.tpolecat" %% "doobie-core" % doobieVersion,
  "org.tpolecat" %% "doobie-contrib-postgresql" % doobieVersion,
  "org.tpolecat" %% "doobie-contrib-specs2" % doobieVersion
)

scalacOptions += "-feature"

//initialCommands in console := "import scalaz._, Scalaz._"