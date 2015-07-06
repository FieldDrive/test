name := "testing"
organization := "fielddrive"
version := "1.0.0"

resolvers := Seq("FieldDrive Repo" at "https://develop.fielddrive.io/artifactory/repo")

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-Xcheckinit",
  "-Xlint",
  "-Xverify",
  "-Yclosure-elim",
  "-Yinline",
  "-Yno-adapted-args",
  "-encoding", "utf8",
  "-target:jvm-1.7")
                      
