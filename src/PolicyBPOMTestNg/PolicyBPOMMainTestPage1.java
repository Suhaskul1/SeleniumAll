package PolicyBPOMTestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PolicyBPOMMainTestPage1 {

	PolicyBPOMSignIn SignIn;
	PolicyBMobilePage mobNum;
	PolicyBPwdPage passwrd;
	PolicyBHomePage home;
	PolicyBMyaccPage myacc;
	PolicyBProfilePage profile;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		SignIn=new PolicyBPOMSignIn(driver);
		 mobNum=new PolicyBMobilePage(driver);
		passwrd= new PolicyBPwdPage(driver);
		home=new PolicyBHomePage(driver);
		myacc=new PolicyBMyaccPage(driver);
		profile=new PolicyBProfilePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException, InterruptedException
	{
		SignIn.clickOnSignin();
		mobNum.enterMobilenum(sh.getRow(0).getCell(0).getStringCellValue());
		mobNum.clickOnSignInwithpwd();
		Thread.sleep(2000);
		
		passwrd.enterPassword(sh.getRow(0).getCell(1).getStringCellValue());
		passwrd.clickOnSignIn();
		Thread.sleep(1000);
		
		
	}
	
	@Test
	public void verifyFullName() throws IOException, InterruptedException
	{
		home.clickOnMyacc();
		Thread.sleep(1000);
		myacc.clickOnProfile();
		profile.switchToChildWindow();
		Thread.sleep(1000);
		profile.verifyFullName(sh.getRow(0).getCell(2).getStringCellValue());
	}
	
	@AfterMethod
	public void logOutToApp()
	{
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}
