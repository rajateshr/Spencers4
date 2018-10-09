package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.SpCartPopUp;
import PageObjects.SpCheckoutPage;
import globals.Constants;
import globals.Globles;

public class CheckOutTC extends BaseClass {
	 @Test(priority=7)
  public void verifyUIinCOA() throws InterruptedException {
	 
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase7+"-------------------------------");		
	       Thread.sleep(5000);		  
	       Globles.verifyElementIsPresent(driver,spCheckoutPage.checkoutheading);
		   Globles.verifyElementIsPresent(driver,spCheckoutPage.deliveryicon);
           Globles.verifyElementIsPresent(driver,spCheckoutPage.deliveryInfoHead);
           Globles.verifyElementIsPresent(driver,spCheckoutPage.paymenticon);
           Globles.verifyElementIsPresent(driver,spCheckoutPage.paymentinfoHead);           
  }
	 @Test(priority=8)
  public void createAddresCOA() throws InterruptedException {   
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
  System.out.println("-----------------"+Constants.Spencers_TestCase8+"-------------------------------");		
  Thread.sleep(10000);		  
  Globles.click(spCheckoutPage.createaddressicon); 
  Thread.sleep(4000);
  Globles.verifyElementIsPresent(driver,spCheckoutPage.addresscreatepopup);
  Thread.sleep(10000);
		   Globles.enterText(spCheckoutPage.firstnameAddress,Constants.Spencers_FirstName);
		   Globles.enterText(spCheckoutPage.streetaddress,Constants.Spencers_StreetAddress);
		   Globles.enterText(spCheckoutPage.streetaddress1,Constants.Spencers_StreetAddress1);
		   Globles.enterText(spCheckoutPage.pincode,Constants.Spencers_Pincode2);
		   Globles.enterText(spCheckoutPage.city,Constants.Spencers_City1);
		   Globles.enterText(spCheckoutPage.phonenumber,Constants.Spencers_Mobile);
		   Thread.sleep(5000);
		   Globles.click(spCheckoutPage.officelabel);
		   Globles.isChecked(spCheckoutPage.officecheck);
		   Globles.click(spCheckoutPage.UpdateButton);
	       Thread.sleep(30000);
	       Globles.click(spCheckoutPage.selectaddress); 

  }
	 @Test(priority=9)
 public void delslotselection() throws InterruptedException {   
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase10+"-------------------------------");		
	  Thread.sleep(8000);
	  Globles.click(spCheckoutPage.expandbutton); 
	  Thread.sleep(4000);
	  Globles.click(spCheckoutPage.selectslot); 
	  Thread.sleep(3000);
	  Globles.click(spCheckoutPage.selectslottiming);
	  Thread.sleep(6000);
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.selectslotdisplay); 
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.selectslottimingdisplay);   
  }
	 @Test(priority=10)
  public void verifyingTheOrdertotal() {   
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase11+"-------------------------------");		
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.ordervalue); 
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.TotalText);   
  }
	 @Test(priority=11)
 public void clickPayButtonInCOA() throws InterruptedException {   
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase12+"-------------------------------");		
	  Thread.sleep(5000);
	  Globles.click(spCheckoutPage.payamountbutton); 
  }
	 
@Test(priority=12)
 public void OrderSummary() throws InterruptedException {   
	  SpCheckoutPage spCheckoutPage = PageFactory.initElements(BaseClass.driver,SpCheckoutPage.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase13+"-------------------------------");		
	  Thread.sleep(6000);
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.TotalText); 
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.OrderTotal); 
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.deliveryChargestext);   
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.deliveryChargesvalue);   
	  //Globles.verifyElementIsPresent(driver,spCheckoutPage.promocashtext); 
	  //Globles.verifyElementIsPresent(driver,spCheckoutPage.promocashamount);
	  /*Globles.verifyElementIsPresent(driver,spCheckoutPage.spencerwalletamount);*/
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.YouPayText);
	  /*Globles.verifyElementIsPresent(driver,spCheckoutPage.YouPayamount);*/
	  /*Globles.click(spCheckoutPage.UndoWallet);*/
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.YouPayamount);
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.selectPayment);
	  Globles.click(spCheckoutPage.CODPaymentSelection);
	  Thread.sleep(3000);
	  Globles.verifyElementIsPresent(driver,spCheckoutPage.CODPaymentSelectionLabel);
	  Globles.click(spCheckoutPage.CODPaymentSelectionLabel);
	  Thread.sleep(3000);
	  Globles.isChecked(spCheckoutPage.CODPaymentSelectionBox);
	  Globles.click(spCheckoutPage.confirmOrderButton);
	  Thread.sleep(6000);

	  
  }
}
