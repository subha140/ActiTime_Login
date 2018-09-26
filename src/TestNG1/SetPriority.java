package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority=1)
	public void swswat()
	{
		Reporter.log("swswat", true);
	}
	@Test(priority=5)
	public void poonam()
	{
		Reporter.log("poonam", true);
	}
	
	@Test(priority=3)
	public void juaid()
	{
		Reporter.log("juaid", true);
	}
	
	@Test(priority=4)
	public void milan()
	{
		Reporter.log("milan", true);
	}
	@Test(priority=2)
	public void ajit()
	{
		Reporter.log("ajit", true);
	}


}
