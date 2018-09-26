package TestNG1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DepedencyOnMethod {
	@Test
	public void create()
	{
		Reporter.log("create", true);
		Assert.fail();
		Reporter.log("hi", true);
	}
	@Test
	public void edit() {
		Reporter.log("edit", true);
		
	}
	@Test(dependsOnMethods= {"create","edit"})
	public void delet()
	{
		Reporter.log("delet", true);
	}

}
