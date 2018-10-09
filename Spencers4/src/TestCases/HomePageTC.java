package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import PageObjects.SpHomePageObjects;
import globals.Constants;
import globals.Globles;

@Test(priority=1)
public class HomePageTC extends BaseClass {
	  public void verifyUIforDP() throws Exception {
		  SpHomePageObjects spHomePage = PageFactory.initElements(BaseClass.driver,SpHomePageObjects.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase1+"-------------------------------");		
	  Thread.sleep(5000);
	Globles.verifyElementIsPresent(driver,spHomePage.locationPopup);
	Globles.verifyElementIsPresent(driver,spHomePage.deliveryText);
		   Globles.verifyElementIsPresent(driver,spHomePage.citydropdown);

			  
		   Globles.verifyElementIsPresent(driver,spHomePage.locateaddress);
		  
		  
			  
		   Globles.verifyElementIsPresent(driver,spHomePage.selectdeliverybutton); 
		  
			
		   Globles.verifyElementIsPresent(driver,spHomePage.signinbutton);
		   
		   Globles.verifyElementIsPresent(driver,spHomePage.signupbutton);

			 
		 
		  System.out.println("-----------------End of TC-------------------------------");
  }
@Test(priority=2)
  public void verifydelvrservicable() throws Exception {
	  SpHomePageObjects spHomePage = PageFactory.initElements(BaseClass.driver,SpHomePageObjects.class);;

	  System.out.println("-----------------"+Constants.Spencers_TestCase2+"-------------------------------");
      Thread.sleep(2000);

		  
		  /*Select sel= new Select(spHomePage.citydropdown);
		  sel.selectByVisibleText(Constants.Spencers_City);
      Globles.selectByVisibletext(spHomePage.citydropdown,Constants.Spencers_City);
		 */
	      
	   Globles.enterText(spHomePage.locateaddress,Constants.Spencers_Pincode);
	      
	   Globles.click(spHomePage.selectdeliverybutton);
		  
	  Thread.sleep(1000);	 
	   Globles.verifyElementIsPresent(driver,spHomePage.servingstore);
		 
	  System.out.println("-----------------End of TC-------------------------------");
}
}

