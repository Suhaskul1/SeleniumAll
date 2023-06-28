package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailReport {

	@Test
	public void TC1()
	{
		//System.out.println("running test case 1");
		Reporter.log("running TC1", true);
	}
	
	@Test
	public void TC2()
	{
		//System.out.println("running test case 2");
		Reporter.log("running TC2", true);
	}
	
	@Test
	public void TC3()
	{
		System.out.println("running test case 3");
	}
}
