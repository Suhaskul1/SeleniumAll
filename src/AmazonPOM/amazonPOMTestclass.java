package AmazonPOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonPOMTestclass extends BaseClass {
	
	amazonPOMSignInPage signIn;
	amazonPOMPhonenoPage phoneno;
	amazonPOMPWDPage pwdpage;
	amazonPOMSearch1stProduct search;
	@BeforeClass
	public void openBrowser() throws IOException
	{
	    initializeBrowser();
		signIn= new amazonPOMSignInPage(driver);
		phoneno=new amazonPOMPhonenoPage(driver);
		pwdpage= new amazonPOMPWDPage(driver);
		search=new amazonPOMSearch1stProduct(driver);
	}
	
	@BeforeMethod
	public void loginToSite() throws IOException, InterruptedException
	{
	  
	  signIn.moveToSignIn();
	  signIn.clickOnSignIn();
	  phoneno.enterPhoneNo();
	  Thread.sleep(1000);
	  phoneno.clickOnContinuebtn();
	  Thread.sleep(1000);
	  pwdpage.enterPassword();
	  pwdpage.clickOnpwdSignIn();
	}
	@Test
	public void VerifyFullname() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		search.serachProduct();
		search.clickOnGobtn();
	}
	
	@AfterMethod
	public void logoutToSite()
	{
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
	}
}
