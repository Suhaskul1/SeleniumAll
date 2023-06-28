package PolicyBPOMTestNgBaseClassUtilitiy;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class PolicyBPOMMainTestPage1 extends BaseClass {

	PolicyBPOMSignIn SignIn;
	PolicyBMobilePage mobNum;
	PolicyBPwdPage passwrd;
	PolicyBHomePage home;
	PolicyBMyaccPage myacc;
	PolicyBProfilePage profile;
	PolicyBPOMSignoutPage signOut;
	int TCID;
	
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		
		initializeBrowser();
		
		SignIn=new PolicyBPOMSignIn(driver);
		mobNum=new PolicyBMobilePage(driver);
		passwrd= new PolicyBPwdPage(driver);
		home=new PolicyBHomePage(driver);
		myacc=new PolicyBMyaccPage(driver);
		profile=new PolicyBProfilePage(driver);
		signOut= new PolicyBPOMSignoutPage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException, InterruptedException
	{
		SignIn.clickOnSignin();
		mobNum.enterMobilenum(utilityClass.getPFData("MobNum"));
		mobNum.clickOnSignInwithpwd();
		Thread.sleep(2000);
		
		passwrd.enterPassword(utilityClass.getPFData("Pass"));
		passwrd.clickOnSignIn();
		Thread.sleep(1000);
		
		
	}
	
	@Test(priority=1)
	public void verifyFullName() throws IOException, InterruptedException
	{
		TCID=01;
		home.clickOnMyacc();
		Thread.sleep(1000);
		myacc.clickOnProfile();
		profile.switchToChildWindow();
		Thread.sleep(1000);
//		profile.verifyFullName(utilityClass.getTestData(0, 2));
		
		String actName=profile.getFullName();
		String expName=utilityClass.getTestData(0, 2);
		Assert.assertEquals(actName, expName,"Failed: both results are different");
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority=2)
	public void verifyEmail() throws IOException, InterruptedException
	{
		TCID=02;
		Thread.sleep(2000);
		home.clickOnMyacc();
		Thread.sleep(1000);
		myacc.clickOnProfile();
		profile.switchToChildWindow();
		Thread.sleep(1000);
		
		String actEid=profile.getEmailId();
		String expEid=utilityClass.getPFData("expEid");
		Assert.assertEquals(actEid, expEid,"Failed: both results are different");
		Thread.sleep(2000);
		System.out.println(actEid);
	}
	
	@AfterMethod
	public void logOutToApp(ITestResult s1) throws IOException
	{
		signOut.switchToHomePage();
		home.clickOnMyacc();
		signOut.clickOnSignOut();
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			utilityClass.CaptureSS(driver, TCID);
		}
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
//		Thread.sleep(2000);
//		driver.quit();
	}
	
	
}
