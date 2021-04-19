package Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.Config;

public class LoginPage extends Config {


@FindBy(linkText="Login")
private WebElement Login;
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement email;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement submit;
	@FindBy(xpath="//button[.='✕']")
	private WebElement X;



public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void loginPage()
{
	X.click();
	Login.click();
	email.sendKeys("9776161516");
	password.sendKeys("Shakti@05");
 submit.click();
 
}
}

