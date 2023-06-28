package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAnnotation {

	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open the browser", true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("Log in to app",true);
	}
	@Test
	public void FullNameVerification1()
	{
		Reporter.log("running verify full name TC1", true);
	}
	
	@Test
	public void FullNameVerification2()
	{
		Reporter.log("running verify full name TC2", true);
	}
	
	@AfterMethod
	public void logoutToApp()
	{
		Reporter.log("log out the app", true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close the browser",true);
	}
}
