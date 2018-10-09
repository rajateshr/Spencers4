package TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.SpAccountPageObjects;
import PageObjects.SpHomePageObjects;
import PageObjects.SpLoginPageObjects;
import globals.Constants;
import globals.Globles;

public class LoginTC extends BaseClass {
 
 @Test(priority=3)
  public void login() throws InterruptedException {
	  SpLoginPageObjects spLoginPage = PageFactory.initElements(BaseClass.driver,SpLoginPageObjects.class); 
	  SpHomePageObjects spHomePage = PageFactory.initElements(BaseClass.driver,SpHomePageObjects.class); 
	  SpAccountPageObjects spAccPage = PageFactory.initElements(BaseClass.driver,SpAccountPageObjects.class); 

	  System.out.println("-----------------"+Constants.Spencers_TestCase3+"-------------------------------");		
	     
	  Thread.sleep(10000);
	 
	  Globles.click(spHomePage.accountbutton);	
	  Thread.sleep(5000);
	   Globles.verifyElementIsPresent(driver,spHomePage.myaccountpopup);
		  Globles.click(spHomePage.loginbutton);	
		  Thread.sleep(5000);
			 Globles.enterText(spLoginPage.emailtext,Constants.Spencers_Username);
			 Globles.enterText(spLoginPage.passtext,Constants.Spencers_Password);
			 Globles.click(spLoginPage.loginbutton);
			 Thread.sleep(10000);
			Globles.verifyElementIsPresent(driver,spAccPage.loginDelvPopUp);
			 //Globles.isAttributePresent(spAccPage.locatePincode,Constants.Spencers_Pincode0);
			Globles.enterText(spAccPage.locatePincode,Constants.Spencers_Pincode1);
			Globles.click(spAccPage.deliverybutton);
			 Thread.sleep(10000);
			 Globles.click(spAccPage.profilebutton);
             Thread.sleep(2000);
      	   Globles.verifyElementIsPresent(driver,spAccPage.accountpopup);
      	   Globles.verifyElementIsPresent(driver,spAccPage.acccustname);
			 Globles.click(spAccPage.viewprofile); 
			 Thread.sleep(5000);
			 Globles.click(spAccPage.editprofile);
			 Globles.scrollBy(20);
			 Globles.isAttributePresent(spAccPage.accmobilenumber,Constants.Spencers_MobileNumber);
			 Globles.isAttributePresent(spAccPage.accemailaddress,Constants.Spencers_EmailAddress);

		 System.out.println("-----------------End of TC-------------------------------");
  }
  
}
