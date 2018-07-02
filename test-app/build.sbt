lazy val root = (project in file(".")).
  aggregate(app).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.10.1"
    )),
    name := "test-app-root"
  )

lazy val app = (project in file("app")).
  settings(
    name := "test-app"
  )
