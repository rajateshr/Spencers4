package PageObjects;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestCases.BaseClass;

public class SpHomePageObjects {
	//Define the page Objects
		//Defining the page objects in Home page delivery location popup
	public SpHomePageObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}	
		@FindBy(xpath=".//*[@id='social-form-locate']")
		public WebElement locationPopup;
		
		@FindBy(xpath=".//*[@id='social-form-locate']/h1[text()='Where do you want us to deliver?']")
		public WebElement deliveryText;
		
		@FindBy(xpath=".//*[@id='citydropdown']")
		public WebElement citydropdown;
		
		@FindBy(xpath=".//*[@id='locate-address']")
		public WebElement locateaddress;
		
		@FindBy(xpath=".//*[@id='social-form-locate']/div[4]/div[1]/a")
		public WebElement selectdeliverybutton;
		
		@FindBy(xpath=".//*[@id='social-form-locate']/div[4]/div[3]/a[1]")
		public WebElement signinbutton;
		
		@FindBy(xpath=".//*[@id='social-form-locate']/div[4]/div[3]/a[2]")
		public WebElement signupbutton;
			
		
		@FindBy(xpath="//a[text()='Serving Store:']/span[text()='One Awadh']")
		public WebElement servingstore;
		
		@FindBy(xpath=".//*[@id='update_customer_data']/span/button")
		public WebElement accountbutton;

		@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]")
		public WebElement myaccountpopup;
		
		@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/h2[text()='My Account']")
		public WebElement myaccounttext;
		
		@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div[1]/img")
		public WebElement myaccountimg;
		
		@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[1]/div[3]/a[text()=' Register']")
		public WebElement register;
		
		@FindBy(xpath=".//*[@id='update_customer_data']/div/div[2]/div[4]/div/a")
		public WebElement loginbutton;
		
		@FindBy(xpath="html/body/div[3]/header/div[1]/div[2]/a/img")
		public WebElement spencerslogo;
		
	
}
