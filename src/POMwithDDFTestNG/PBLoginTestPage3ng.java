package POMwithDDFTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTestPage3ng extends BaseClass {

	//global object
	PBLoginPage3 login;
	PBMobNumPage3 mobNum;
	PBPwdPage3 pwd;
	PBHomePage3 home;
	PBMyAccPage3 myAcc;
	PBProfilePage3 profile;
	

	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		
		 
		 initializeBrowser();
		
		 
		 login=new PBLoginPage3(driver);
		 mobNum=new PBMobNumPage3(driver);
		 pwd=new PBPwdPage3(driver);
		 home=new PBHomePage3(driver);
		 myAcc=new PBMyAccPage3(driver);
		 profile=new PBProfilePage3(driver);
		 
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, IOException
	{
		login.clickOnSignInBtn();
		mobNum.enterMobNum(UtilityClass.getTestData(0, 0));
		mobNum.clickOnSignInWithPwdBtn();
		pwd.enterPwd(UtilityClass.getTestData(0, 1));
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws InterruptedException, IOException
	{
		home.openMyAccDropDownOptions();
		Thread.sleep(1000);
		myAcc.clickOnMyProfile();
		Thread.sleep(1000);
		profile.switchToSwitchChildWindow();
		//profile.verifyFullName(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actResult=profile.getPBProfilePageFullName();
		String expResult=UtilityClass.getTestData(0, 2);
		
		Assert.assertEquals(actResult, expResult,"Failed: both results are different");
	}
	
	@AfterMethod
	public void logOutApp()
	{
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
