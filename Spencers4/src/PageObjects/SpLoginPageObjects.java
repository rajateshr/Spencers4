package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpLoginPageObjects {
	//Define the page Objects
			//Defining the page objects in Home page delivery location popup
			@FindBy(xpath=".//*[@id='social-login-popup']/div[2]/div/div/div/div[@id='mainloginPopup']")
			public WebElement loginPopup;
			
			@FindBy(xpath=".//*[@id='social-login-authentication']/h1[@class='login-title']")
			public WebElement logintitle;
			
			@FindBy(xpath=".//*[@id='email']")
			public WebElement emailtext;
			
			@FindBy(xpath=".//*[@id='pass']")
			public WebElement passtext;
			
			@FindBy(xpath=".//*[@id='bnt-social-login-authentication']")
			public WebElement loginbutton;
			
			@FindBy(xpath=".//*[@id='social-form-login']/fieldset/div[4]/div[2]/a/span[text()='Forgot Your Password?']")
			public WebElement fgtpwdlink;
			
			@FindBy(xpath=".//*[@id='social-form-login']/fieldset/div[6]/span[2]/div/div/div[1]/a/span[@class='fa fa-facebook']")
			public WebElement fbbutton;
			
			@FindBy(xpath=".//*[@id='social-form-login']/fieldset/div[6]/span[2]/div/div/div[2]/a/span[@class='fa fa-google']")
			public WebElement googlebutton;
			
			@FindBy(xpath=".//*[@id='login_links']/li[2]/a")
			public WebElement loginicon;
			
			@FindBy(xpath=".//*[@id='delivery_location_popup']/div[@class='sprite_sprint_login_signup login_signup_back_arrow']")
			public WebElement backarrow;
			
		
			/*public WebElement getMyAccountBtn() {
		        return myaccount;
		    
			}*/
}
