package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpCartPopUp {
	@FindBy(xpath="//div[@class='header content']/div[@class='right_header col-sm-4 pull-right no-padding']/div[@class='minicart-wrapper']/span/a[@class='action showcart']")
	public WebElement carticon;
	
	@FindBy(xpath="html/body/div[3]/header/div[1]/div[1]/div[1]/div/div[@data-role='dropdownDialog']")
	public WebElement cartpopup;
	
	@FindBy(xpath="//div[@class='image']/a[@href='https://beta.spencers.in/amul-kool-badam-milk-200ml.html']//following-sibling::span[@class='product-image-container']//child::span[@class='product-image-wrapper']//child::img[@src='https://d17oijia0osjmt.cloudfront.net/media/catalog/product/cache/f485795eb4b45ff97c82d72651274f10/1/2/1277042p.jpg']")
	public WebElement prodcartimage;
	
	@FindBy(xpath=".//*[@id='minicart-content-wrapper']/div[2]/span/span/span[text()='₹484.38']")
	public WebElement remainingOrderamount;
	
	@FindBy(xpath=".//*[@id='minicart-content-wrapper']/div[2]/span/span")
	public WebElement shopmoreText;
	

	@FindBy(xpath="//ol[@id='mini-cart']/li/div/div[2]/h1//child::a[text()='Amul Kool Badam Milk 200ml']")
	public WebElement cartprodname;
	
	@FindBy(xpath="//a[text()='Amul Kool Badam Milk 200ml']//following::div[@class='price-container']//child::span[@ data-bind='html: price']//child::span[@class='price-including-tax']//child::span[@class='minicart-price']//child::span[text()='₹20.00']")
	public WebElement cartproductprice;
	
	@FindBy(xpath=".//*[@id='minicart-content-wrapper']/div[2]/div[3]/div/span[text()='Total: ']")
	public WebElement carttotal;
	
	@FindBy(xpath=".//*[@id='minicart-content-wrapper']/div[2]/div[3]/div/span[@data-bind='html: cart().subtotal_incl_tax']/span[text()='₹20']")
	public WebElement carttotalprice;
	
	@FindBy(xpath=".//*[@id='minicart-content-wrapper']/div[2]/div[4]/div/a/span/span[text()='View Cart & Checkout']")
	public WebElement viewcheckout;
	

	
	
	
	
	
	
	

	
	
}

