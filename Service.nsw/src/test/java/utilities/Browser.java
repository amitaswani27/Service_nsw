package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Browser class keep all browser settings which is required for testing.
 * 
 */

public class Browser {
	
	static WebDriver driver;

	/**
	 * This method is used to open the browser.
	 * 
	 * @param browserName
	 * @return WebDriver
	 */
	
	public static WebDriver get(String browserName)
	{
		try {
			if(browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("Google"))
			{
				System.setProperty("webdriver.chrome.driver","./Resources/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("Mozilla"))
			{
				System.setProperty("webdriver.gecko.driver","./Resources/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else
			{
				System.out.println("Browser does not exist");
			}
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
		return driver;
	}

}
