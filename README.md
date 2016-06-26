# Basic SBT project
This is a basic Scala project that uses SBT for building and testing. When I first moved from using Eclipse to SBT to build my Scala projects, I couldn't find a good basic project template to use just to get started. This is an attempt to remedy that.

## Features
* A short, readable build.sbt with no mystery meat
* Separate `src` and `test` folders
* Tests with [Scalatest](http://www.scalatest.org/), to run: `sbt test`
* Scala style linting with [Scalastyle](http://www.scalastyle.org/), to run: `sbt scalastyle`. The Scalastyle configuration is in `scalastyle-config.xml`

## Q&A
### Is this the best way to set up an SBT project?
There are so few good examples on the internet, that I have no idea!

### This is terrible/you're doing XYZ wrong!
Please submit a pull request!
