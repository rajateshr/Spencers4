package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseClass {
	public static WebDriver driver;
	
  @Parameters({"browser","url"})		  
  @BeforeSuite
  public void launchBrowser(String browser,String url) throws Exception
  {
	  if(browser.equalsIgnoreCase("firefox")) {
		  
		  System.setProperty("webdriver.firefox.marionette","D:\\Driver\\geckodriver.exe");
		  
		  driver = new FirefoxDriver();
	   
		  driver.manage().window().maximize();
		  driver.get(url);
	  }
	  else if (browser.equalsIgnoreCase("chrome")) {  
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	 
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	  } 
	 
  }
  @AfterSuite  
  public void quitBrowser() throws Exception 
  {
	   
	  driver.quit();
	 }
}
