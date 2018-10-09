package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpPLPPageObjects {
	@FindBy(xpath=".//*[@id='page-title-heading']/span[text()='Apples | Pears | Plums & Peaches']")
	public WebElement catheading;

	@FindBy(xpath=".//*[@id='maincontent']/div[3]/div/div[1]/div[7]/ol/li[2]/div/div[2]/div[1]/h2/a[normalize-space() = 'Fresh Value Shimla Apple']")
	public WebElement plpproductname;
	
	@FindBy(xpath=".//*[@id='product-price-4524']/span[text()='₹139']")
	public WebElement plpproductprice;
	
	@FindBy(xpath=".//*[@id='addtocart-4524']/button[@title='Add to Cart']")
	public WebElement plpaddtocart;
}

