package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpSearchPageObjects {
	public SpSearchPageObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}	
		@FindBy(xpath="html/body/div[3]/header/div[1]/div[3]")
		public WebElement searchbar;
		
		@FindBy(xpath=".//*[@id='search_mini_form']/div[1]/div/div[@class='trending_recent_content']")
		public WebElement searchpopup;
		
		@FindBy(xpath=".//*[@id='trending_search_data']/span[@class='trending']")
		public WebElement TrendSearchHeading;
		
		@FindBy(xpath=".//a[@name='popular'][text()='milk']")
		public WebElement milkKeyword;
		
		@FindBy(xpath=".//*[@id='maincontent']/div[1]/h1/span[text()='Search Result (milk)']")
		public WebElement searchheading;
		
		/*@FindBy(xpath=".//*[@id='maincontent']/div[3]/div[1]/div[5]/div[3]/div[1]/ol/li[2]/div/div[1]/a/span/span/img[@src='https://d17oijia0osjmt.cloudfront.net/media/catalog/product/cache/9ec2df9d52341e4b197c6755333cc4c2/1/2/1277042p.jpg']")
		public WebElement productimage;*/
		
		@FindBy(xpath="//div[@class='product details product-item-details']/div[@class='product name product-item-name product-info']/h2[@class='product-name']/a[normalize-space(text())='Amul Kool Badam Milk 200ml']")
		public WebElement productname;
		
		@FindBy(xpath=".//a[normalize-space(text())='Amul Kool Badam Milk 200ml']//following::span[@id='product-price-24763']//child::span[text()='₹20']")
		public WebElement productprice;
		
		@FindBy(xpath=".//input[@value='Amul Kool Badam Milk 200ml']//following-sibling::button[@title='Add to Cart']")
		public WebElement addtocart;
		
		@FindBy(xpath="html/body/div[4]/header/div[1]/div[1]/div[1]/span/a[@class='action showcart']")
		public WebElement carticon;
}
