# JPMorgan
This project is done using Selenium-Cucumber-Maven-Junit.

Feature file location - BDDScenarios\src\test\resources\Features\

Step Definition file location - BDDScenarios\src\test\java\StepDefinitions\

Page Factory pages location - BDDScenarios\src\test\java\Pages\

ChromeDriver location - BDDScenarios\src\test\resources\server\chromedriver.exe

Test Runner class location - BDDScenarios\src\test\java\StepDefinitions\TestRunner.java



How to Run the test?

TestRunner.Java
1. Required libraries are mentioned in pom.xml, wait until project is fully loaded.
2. Navigate to TestRunner class and right-click to RunAs Junit test
3. After successful run, navigate to BDDScenarios\target\JUnitReports\report.xml to check the results

Cucumber feature runner
1. Required libraries are mentioned in pom.xml, wait until project is fully loaded.
2. Navigate to BDDScenarios\src\test\resources\Features\homepage.feature
3. right-click to RunAs Cucumber Feature
4. After successful run, results can be viewed in console

maven run from eclipse
1. Navigate to project in menubar of eclipse and select clean, Clean the Project
2. Right-Click on Project in Project explorer and click on Run As to select Maven test.
3. After successful run, navigate to BDDScenarios\target\JUnitReports\report.xml to check the results




