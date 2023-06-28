package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testInvocation {

	//invocation count use to repeat the test case for number of times
	
	@Test(invocationCount=5)
	public void FullNameVerification1()
	{
		Reporter.log("running verify full name TC1", true);
	}
	
	@Test(invocationCount=2)
	public void FullNameVerification2()
	{
		Reporter.log("running verify full name TC2", true);
	}
}
