package DemoTest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.LoginPage;
import config.Config;

public class FlipkartTest extends Config {

	@Test
	public void test() throws InterruptedException{
	    LoginPage run=new LoginPage(driver);
		run.loginPage();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Homepage start=new Homepage(driver);
		start.home();
		Thread.sleep(5000);
	}
	

}
