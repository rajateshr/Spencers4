package TestCases;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.SpAccountPageObjects;
import PageObjects.SpCheckoutPage;
import globals.Constants;
import globals.Globles;

public class OrderSuccessPage extends BaseClass {
	@Test(priority=13)
  public void verifyOrderSuccess() throws InterruptedException {
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase14+"-------------------------------");		
      Thread.sleep(5000);	
      Globles.verifyElementIsPresent(driver,spCheckoutPage.OrderSuccessfull);
	   Globles.verifyElementIsPresent(driver,spCheckoutPage.trackorderlink);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.OrderDetailstext);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.deliverydatetext);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.deliverydatevalue);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.deliveryslottext);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.deliveryslottime);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.paymentmodetext);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.paymentmodeCOD);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.productcolumn);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.productcolumn);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.perunitpricecolumn);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.quantitycolumn);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.amountcolumn);    
      Globles.verifyElementIsPresent(driver,spCheckoutPage.ordersuccessPrdfullamt);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.ordersuccessPrdCount);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.ordersuccessUnitPrice);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.ordersuccessPrdname);
      Globles.verifyElementIsPresent(driver,spCheckoutPage.ordersuccessPrdimg);
  }
	@Test(priority=14)
public void logout() throws InterruptedException {
	  SpAccountPageObjects spAccPage = PageFactory.initElements(BaseClass.driver,SpAccountPageObjects.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase15+"-------------------------------");		
	  WebElement MyAccountPopup2=spAccPage.accountpopup;
	  Globles.click(spAccPage.profilebutton);
    Thread.sleep(2000);
		 try
		{
			 MyAccountPopup2.isDisplayed();
			System.out.println(MyAccountPopup2+" is present=PASS");
		}
		catch(NoSuchElementException e)
		{
			System.out.println(MyAccountPopup2+" is not present=FAIL");

		}
		 Globles.click(spAccPage.logout);
}
}
