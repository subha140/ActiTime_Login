package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Demo {
	@Test
	public void softAssert() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String actualTitel=driver.getTitle();
		System.out.println(actualTitel);
		String expectedTitel="Acti timelog";
		Thread.sleep(5000);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitel, expectedTitel);
		Reporter.log("hlw", true);
		Reporter.log("hi", true);
		s.assertAll();
		
		
	}

}
