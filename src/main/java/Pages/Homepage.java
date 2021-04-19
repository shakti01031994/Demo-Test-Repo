package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends LoginPage {

	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement search;
	@FindBy(className="_10Ermr")
	private WebElement searchResult;
	@FindBy(xpath="//div[contains(text(),'My Account')]")
	private WebElement account;
	@FindBy(className="_3SkBxJ")
	private WebElement cart;
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	
	
		PageFactory .initElements(driver, this);
		
	}
	
	public void home() throws InterruptedException
	{  
	
		search.sendKeys("iphone_12"+Keys.ENTER);
		if(searchResult.isDisplayed()){
		System.out.println(searchResult.getText());
		System.out.println("passed");
		
	}
		else
		{
			System.out.println("failed");
		}
		Thread.sleep(5000);
		//cart.click();
		
		try{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'My Account')]")));
		/*Actions act=new Actions(driver);
		act.moveToElement(account).perform();*/
		account.click();
		Select option=new Select(account);
		option.selectByVisibleText("Logout");
		}
		catch(NullPointerException n)
		{
			System.out.println("still loggedin");
		}
	}
		
	}

	


