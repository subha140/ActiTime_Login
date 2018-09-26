package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyTitle {
		@Test
	public void verify()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualtime=driver.getTitle();
		System.out.println(actualtime);
		String expectedTitel="Acti_time_log";
		
		Assert.assertEquals(actualtime, expectedTitel);
		//Assert.assertSame(actualtime, expectedTitel);
		//Assert.assertNotEquals(actualtime, expectedTitel);
		//Assert.assertNotSame(actualtime, expectedTitel);
		
	}
	

	

   }
