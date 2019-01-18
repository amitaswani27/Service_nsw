
Selenium automation-framework

The TestNG automation framework guidance for the following Website: https://www.service.nsw.gov.au/




1- Maven project

Added all the required dependencies.
Get the required dependencies from: https://mvnrepository.com




2- pom.xml file

Add the following dependencies: Selenium, TestNG

Get the required dependencies from: https://mvnrepository.com

3- Config.properties

It is an input data section, the input values can be modified, added, deleted from here.

4- Webdrivers

Download firefox driver from here: https://github.com/mozilla/geckodriver/releases

Download chrome driver from here: http://chromedriver.chromium.org/

Set up the drivers on the Browser page, import the org.openqa.selenium.WebDriver;



5- Core 

To run before and after test suite, and initiate browser with TestNG annotation.

Core will help to run the required test suite with the help of TestNG such as 

	@BeforeSuite
	public void openbrowser()

	public void initBrowser()

	@AfterSuite
	public void closebrowser()




6- Utilities package

Browsers: Browser settings to open a browser are setup here.

CommonDriver: Input data from Config.properties are being be fetched from here.



7- web_pages

All the required web elements are stored here and and being used in the test cases.



8- Test Cases

Test cases are setup here will be executed with the TestNG.



9- Test Output

TestNG reports are being generated and saved under this folder which will show all the pass and failed test cases status.


