package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import core.Core;
import web_pages.Service_nsw;

/**
 * LoginSuccessfully Class will have all the test cases which is used to perform
 * all the expected steps, on Login, Blog Draft and Blog Published page.
 * 
 * @author Amit Aswani
 * 
 */

public class Search_Locate extends Core{
	
	@Test(priority=0)
	public void Search()
	{
		Service_nsw Search = PageFactory.initElements(driver, Service_nsw.class);	
		Search.Search_Number_Plate();
	}
	
	@Test(priority=1)
	public void Locate_us()
	{
		Service_nsw Locate = PageFactory.initElements(driver, Service_nsw.class);	
		Locate.Locate_us();
	}
	
}

