package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpPDPPageObjects {
	@FindBy(xpath=".//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/h1/span[text()='Fresh Value Shimla Apple']")
	public WebElement productnamePDP;
	
	@FindBy(xpath=".//*[@id='maincontent']/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[@href='http://spencers-shop.embdev.in/media/catalog/product/cache/cb615fed7e25c7266c50bf502a138c0c/1/0/1019916p.jpg']")
	public WebElement productimage;
	
	@FindBy(xpath=".//*[@id='maincontent']/div[2]/div[1]/div[2]/div[3]/div/span/span[text()='MRP']")
	public WebElement productMRP;
	
	@FindBy(xpath=".//*[@id='product-price-4524']/span[text()='₹139']")
	public WebElement productpricePDP;
	
	@FindBy(xpath=".//*[@id='product-addtocart-button']/span[text()='Add +']")
	public WebElement AddPDP;
	
	
	
}
