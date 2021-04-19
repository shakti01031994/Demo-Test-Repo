package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config {
	public WebDriver driver;
	@BeforeMethod
	public void config()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		
	}
	/*@AfterMethod
	public void tearDown(){
		
		driver.close();
	}
	*/

}
