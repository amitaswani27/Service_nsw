package web_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utilities.CommonDriver;

/**
 * Searvice_nsw class refers to the Home page of Service.nsw.gov web site
 * All the required web elements of the page are stored here.
 * 
 */

public class Service_nsw {
	
	WebDriver driver;
	public Service_nsw (WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@id='edit-contains']")
	WebElement Search;
	
	@FindBy(xpath="//input[@id='edit-submit-site-search']")
	WebElement Searchbutton;
	
	@FindBy(linkText="Apply for a number plate")
	WebElement Apply_number_plate;
	
	@FindBy(xpath="//a[contains(text(),'Locate us')]")
	WebElement Locate_us;
	
	@FindBy(xpath="//input[@id='locatorTextSearch']")
	WebElement Enter_Suburb;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Searchbutton1;
	
	
	/**
	 * Search_Number_Plate class will search an item on Service.nsw.gov web site
	 * Locate_us class will take us to locate us page on Service.nsw.gov web site
	 * 
	 */

	public void Search_Number_Plate()
	{
		String SearchItem = CommonDriver.getProperties("Search_item");

        String SearchResultsPageTitle = "";
        String ExpectedSearchTitle ="Search Results | Service NSW";
        
        Search.sendKeys(SearchItem);
		Searchbutton.click();
		
		SearchResultsPageTitle = driver.getTitle();
		
		/*
         * compare the actual title of the page with the expected one and print
         * the result as "Navigated to appropriate page" or "Failed"
         */
		
        if (SearchResultsPageTitle.contentEquals(ExpectedSearchTitle)){
            System.out.println("Navigated to Search results page successfully");
        } else {
            System.out.println("Test Failed");
        }

        List<WebElement> list1 = driver.findElements(By.xpath("//a[contains(text(),'Apply for a number plate')]"));
 		Assert.assertTrue(list1.size() > 0, "Apply for a number plate link not found!");
	}
 	
 		public void Locate_us()
		{
		String Suburb = CommonDriver.getProperties("Enter_Suburb");
		
		Locate_us.click();
		Enter_Suburb.sendKeys(Suburb);
		Searchbutton1.click();
		
		List<WebElement> list2 = driver.findElements(By.xpath("//a[contains(text(),'Marrickville Service Centre')]"));
		Assert.assertTrue(list2.size() > 0, "Marrickville Service Centre location not found!");
 		
	}
	}

