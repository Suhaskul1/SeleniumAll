package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledFalse {

	@Test
	public void FullNameVerification1()
	{
		Reporter.log("running verify full name TC1", true);
	}
	
	@Test(enabled=false)
	public void FullNameVerification2()
	{
		Reporter.log("running verify full name TC2", true);
	}
	
	@Test(invocationCount=2, enabled=false)
	public void FullNameVerification3()
	{
		Reporter.log("running verify full name TC3", true);
	}
	
}
