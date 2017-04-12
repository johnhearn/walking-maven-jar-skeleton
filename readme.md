"*...we write test infrastructure to drive our non-existent application, so that we can make the first test fail.*"
	- "Growing Object Oriented Software Guided by Tests" by Steve Freeman and Nat Pryce.

Includes:
 - basic POM template to generate an executable JAR
 - (failing) end-to-end acceptance test fixtures based on RobotFramework
 - unit testing dependencies

To fail the test:

	mvn clean package robotframework:run