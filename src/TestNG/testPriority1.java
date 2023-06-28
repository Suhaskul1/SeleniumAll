package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testPriority1 {

	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("Running tc1", true);
	}
	
	@Test(priority=3)
	public void TC2()
	{
		Reporter.log("Running tc2", true);
	}
	
	@Test(priority=2, invocationCount=2)
	public void TC3()
	{
		Reporter.log("Running tc3", true);
	}
	
	@Test(priority=4)
	public void TC4()
	{
		Reporter.log("Running tc4", true);
	}
}
