package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depedency_TestCases {
	@Test(dependsOnMethods="edit")
	public void create()
	{
		Reporter.log("create", true);
	}
	@Test
	public void edit() {
		Reporter.log("edit", true);
		
	}
	@Test(dependsOnMethods="create")
	public void delet()
	{
		Reporter.log("delet", true);
	}

}
