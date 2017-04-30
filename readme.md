"*...we write test infrastructure to drive our non-existent application, so that we can make the first test fail.*"
	- "Growing Object Oriented Software Guided by Tests" by Steve Freeman and Nat Pryce.

Simplest version includes just a basic POM template to generate an executable JAR and a single (failing) end-to-end acceptance test fixture based on RobotFramework.

To fail the test:

	mvn clean package robotframework:run
	
(Use -Dpython.console.encoding=UTF-8 to fix cp0 encoding message)  