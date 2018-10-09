package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.SpHomePageObjects;
import PageObjects.SpSearchPageObjects;
import globals.Constants;
import globals.Globles;

public class SearchTC extends BaseClass {
	 @Test(priority=4)
  public void trendingSearch() throws InterruptedException {
	  SpSearchPageObjects spSearchPage = PageFactory.initElements(BaseClass.driver,SpSearchPageObjects.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase4+"-------------------------------");		
	     
	       Thread.sleep(5000);		  
	       Globles.verifyElementIsPresent(driver,spSearchPage.searchbar);
	       Globles.click(spSearchPage.searchbar);
	       Globles.verifyElementIsPresent(driver,spSearchPage.searchpopup);
		   Globles.verifyElementIsPresent(driver,spSearchPage.TrendSearchHeading);
           Globles.verifyElementIsPresent(driver,spSearchPage.milkKeyword);
	       Globles.click(spSearchPage.milkKeyword);
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       //js.executeScript("window.scrollBy(0,1300)");
	       Thread.sleep(30000);
		   Globles.verifyElementIsPresent(driver,spSearchPage.searchheading); 
		   Globles.verifyElementIsPresent(driver,spSearchPage.productname);
		   Globles.verifyElementIsPresent(driver,spSearchPage.productprice);
	       Globles.click(spSearchPage.addtocart);
		  System.out.println("-----------------End of TC-------------------------------");
  }
}
