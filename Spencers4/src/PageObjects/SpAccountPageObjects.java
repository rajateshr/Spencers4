package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpAccountPageObjects {
	//Define the page Objects
			//Defining the page objects in Home page delivery location popup
			@FindBy(xpath=".//*[@id='social-login-popup']/div[2]/div/div/div/div[@id='mainloginPopup']")
			public WebElement loginDelvPopUp;
			
			@FindBy(xpath=".//*[@id='social-form-delivery']/div/h2[text()='Welcome RAJATESH Rathnakar ']")
			public WebElement welcomeaccname;
			
			@FindBy(xpath=".//*[@id='autocomplete-locate']")
			public WebElement locatePincode;
			
			@FindBy(xpath=".//*[@id='autocomplete-locate']/h1")
			public WebElement selectloc;
			
			@FindBy(xpath=".//*[@id='social-form-delivery']/div/div[5]/button[text()='Select Delivery Location']")
			public WebElement deliverybutton;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/span/button")
			public WebElement profilebutton;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[@class='dropdown-menu my_dropdown drop_accounts']")
			public WebElement accountpopup;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div/ul/li[4]/div/a/span[text()='tester Rajatesh']")
			public WebElement acccustname;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div/ul/li[4]/div/a/p[text()='View Profile']")
			public WebElement viewprofile;
			
			@FindBy(xpath=".//*[@id='maincontent']/div[2]/div/div[6]/div/div/div/div[2]/h1[text()='tester Rajatesh']")
			public WebElement profilename;
			
			@FindBy(xpath=".//*[@id='maincontent']/div[2]/div/div[6]/div/div/div/div[2]/div[2]/a[text()='Edit Profile']")
			public WebElement editprofile;

			@FindBy(xpath=".//*[@id='mobile']")
			public WebElement accmobilenumber;
			
			@FindBy(xpath=".//*[@id='tab-basic-info']/div/div[3]/span[2]/input[@class='contact_info_email']")
			public WebElement accemailaddress;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div[1]/img")
			public WebElement myaccountimg;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div[3]/a[text()=' Register']")
			public WebElement register;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[4]/div/a[text()='Log In']")
			public WebElement loginbutton;
			
			@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div/div/a[text()='Log out']")
			public WebElement logout;
			
			/*public WebElement getMyAccountBtn() {
		        return myaccount;
		    
			}*/
}
