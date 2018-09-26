package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Execution_Multiple_Times_Invocation_Count {
	
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
	
	@Test(invocationCount=3,priority=2)
	public void juaid()
	{
		Reporter.log("juaid", true);
	}
	
	@Test
	public void milan()
	{
		Reporter.log("milan", true);
	}
	@Test(invocationCount=5,priority=1)
	public void ajit()
	{
		Reporter.log("ajit", true);
	}

}
