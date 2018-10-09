package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.SpCartPageObjects;
import PageObjects.SpCartPopUp;
import globals.Constants;
import globals.Globles;

public class CartPageTC extends BaseClass {
	 @Test(priority=5)
  public void verifyCartPopUp() throws InterruptedException {
	  SpCartPopUp spCartPopUp = PageFactory.initElements(BaseClass.driver,SpCartPopUp.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase5+"-------------------------------");		
	       Thread.sleep(10000);		  
	       Globles.click(spCartPopUp.carticon);
	       Thread.sleep(2000);		  
	       Globles.verifyElementIsPresent(driver,spCartPopUp.cartpopup);
		   Globles.verifyElementIsPresent(driver,spCartPopUp.prodcartimage);
           Globles.verifyElementIsPresent(driver,spCartPopUp.remainingOrderamount);
	       Globles.click(spCartPopUp.shopmoreText);  
		   Globles.verifyElementIsPresent(driver,spCartPopUp.cartprodname); 
		   Globles.verifyElementIsPresent(driver,spCartPopUp.cartproductprice);
		   Globles.verifyElementIsPresent(driver,spCartPopUp.carttotal);
		   Globles.verifyElementIsPresent(driver,spCartPopUp.carttotalprice);
	       Globles.click(spCartPopUp.viewcheckout);  
		  System.out.println("-----------------End of TC-------------------------------");
  }
	 @Test(priority=6)
  public void verifyCartPage() throws InterruptedException {
	  SpCartPageObjects spCartPage = PageFactory.initElements(BaseClass.driver,SpCartPageObjects.class); 
	  System.out.println("-----------------"+Constants.Spencers_TestCase6+"-------------------------------");		
	  Thread.sleep(5000);		  
      Globles.verifyElementIsPresent(driver,spCartPage.cartheading);
	   Globles.verifyElementIsPresent(driver,spCartPage.productcolumn);
      Globles.verifyElementIsPresent(driver,spCartPage.perunitpricecolumn);
	   Globles.verifyElementIsPresent(driver,spCartPage.quantitycolumn); 
	   Globles.verifyElementIsPresent(driver,spCartPage.amountcolumn);
	   Globles.verifyElementIsPresent(driver,spCartPage.cartprdimage);
	   Globles.verifyElementIsPresent(driver,spCartPage.cartprdname);
	   Globles.verifyElementIsPresent(driver,spCartPage.cartprdprice);
	   Globles.verifyElementIsPresent(driver,spCartPage.cartprdsubtotal);
	   Globles.verifyElementIsPresent(driver,spCartPage.ordersummary);
	   Globles.verifyElementIsPresent(driver,spCartPage.pricetext);
	   Globles.verifyElementIsPresent(driver,spCartPage.orderprice);
	   Globles.verifyElementIsPresent(driver,spCartPage.deliverychargetext);
	   Globles.verifyElementIsPresent(driver,spCartPage.deliverycharges);
	   Globles.verifyElementIsPresent(driver,spCartPage.totalorderamounttext);
	   Globles.verifyElementIsPresent(driver,spCartPage.totalorderamount);
      Globles.click(spCartPage.placeorder);  
  }
}
