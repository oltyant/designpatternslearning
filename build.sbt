import sbt.Keys._

name := "Scala Learning"

version := "1.0"

scalaVersion := "2.11.7"

organization := "com.scalalearning"
				    
resolvers ++= Seq(
					          "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
						          "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
							        )

libraryDependencies ++= Seq(
								              "org.specs2" %% "specs2" % "2.4.17" % "test",
									              "org.scalatest" %% "scalatest" % "2.2.4" % "test",
										              "org.scalacheck" %% "scalacheck" % "latest.release" % Test
											            )
												          
													  resolvers += Classpaths.sbtPluginReleases
