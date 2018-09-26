package TestNG1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void b()
	{
	Reporter.log("swasat", true);
	Assert.fail();
	Reporter.log("poonam", true);
	}
	
	@Test
	public void a()
	{
	Reporter.log("milan", true);
	}
	@Test
	public void c()
	{
	Reporter.log("ajit", true);
	}

}
