name := """GuessThatPet"""
organization := "com.guessthatpet"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.7"

libraryDependencies += guice

import NativePackagerKeys._
pipelineStages := Seq(rjs, digest, gzip)
