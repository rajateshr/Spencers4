package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpCartPageObjects {
	@FindBy(xpath=".//*[@id='maincontent']/div[1]/h1/span[text()='My Cart (1 Items)']")
	public WebElement cartheading;
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/thead/tr/th[1]/span[text()='Product']")
	public WebElement productcolumn;
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/thead/tr/th[2]/span[text()='Per unit Price']")
	public WebElement perunitpricecolumn;
	

	@FindBy(xpath=".//*[@id='shopping-cart-table']/thead/tr/th[3]/span[text()='Quantity']")
	public WebElement quantitycolumn;
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/thead/tr/th[4]/span[text()='Amount']")
	public WebElement amountcolumn;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/form/div[1]/table/tbody/tr/td[1]/a/span/span/img[@src='https://d17oijia0osjmt.cloudfront.net/media/catalog/product/cache/06b3bb8c90e91c2d87d1c6beaa3af431/1/2/1277042p.jpg']")
	public WebElement cartprdimage;
	
	@FindBy(xpath="//div[@class='product-item-details']/strong[@class='product-item-name']/a[text()='Amul Kool Badam Milk 200ml']")
	public WebElement cartprdname;
	
	@FindBy(xpath="//div[@class='product-item-details']/strong[@class='product-item-name']/a[text()='Amul Kool Badam Milk 200ml']//following-sibling::span[@class='mobile-price visible-xs']//child::span[@class='price-including-tax']/span[@class='cart-price']/span[text()='₹20']")
	public WebElement cartprdprice;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/form/div[1]/table/tbody/tr/td[4]/span/span/span[text()='₹20']")
	public WebElement cartprdsubtotal;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/strong[text()='Order Summary']")
	public WebElement ordersummary;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div/table/tbody/tr[1]/th[text()='Price']")
	public WebElement pricetext;
	
	@FindBy(xpath="//tr[@class='totals sub']//following-sibling::td[@data-th='Subtotal']/span[text()='₹20']")
	public WebElement orderprice;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div/table/tbody/tr[2]/th[text()='Delivery Charges']")
	public WebElement deliverychargetext;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div/table/tbody/tr[2]/td/span[text()='₹30']")
	public WebElement deliverycharges;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div/table/tbody/tr[4]/th/strong[text()='Total']")
	public WebElement totalorderamounttext;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div/table/tbody/tr[4]/td/strong/span[text()='₹50']")
	public WebElement totalorderamount;
	
	@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/ul/li/button[@title='Place Order']")
	public WebElement placeorder;
}
