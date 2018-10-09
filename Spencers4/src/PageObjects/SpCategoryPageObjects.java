package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpCategoryPageObjects {
	@FindBy(xpath=".//*[@id='ui-id-5']/span[text()='Fruits & Vegetables']")
	public WebElement l1category;
	
	@FindBy(xpath="//li[@class='ui-menu-item']/a[text()='Fruits & Vegetables']")
	public WebElement l1catheading;
	
	@FindBy(xpath="//li[@class='level1 nav-1-1 first parent ui-menu-item']/a/span[text()='Fresh Fruits']")
	public WebElement l2category;
	
	@FindBy(xpath="//li[@class='ui-menu-item']/a[text()='Fresh Fruits']")
	public WebElement l2heading;

	@FindBy(xpath="//li[@class='level2 nav-1-1-1 first ui-menu-item']/a/span[text()='Apples | Pears | Plums & Peaches']")
	public WebElement l3category;
}
