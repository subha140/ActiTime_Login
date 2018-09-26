package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestMethods {
	@Test
	public void swswat()
	{
		Reporter.log("swswat", true);
	}
	@Test
	public void poonam()
	{
		Reporter.log("poonam", true);
	}
	
	@Test
	public void juaid()
	{
		Reporter.log("juaid", true);
	}
	
	@Test
	public void milan()
	{
		Reporter.log("milan", true);
	}
	@Test
	public void ajit()
	{
		Reporter.log("ajit", true);
	}

}
