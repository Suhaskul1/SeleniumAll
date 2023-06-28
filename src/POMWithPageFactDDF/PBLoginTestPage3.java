package POMWithPageFactDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTestPage3 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	 FileInputStream file=new FileInputStream("C:\\Users\\\\Dell\\Documents\\WithDDF.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.policybazaar.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 PBLoginPage3 login=new PBLoginPage3(driver);
	 login.clickOnSignInBtn();
	 
	 String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
	 PBMobNumPage3 mobNum=new PBMobNumPage3(driver);
	 mobNum.enterMobNum(mobilenum);
	 mobNum.clickOnSignInWithPwdBtn();
	 Thread.sleep(2000);
	 
	 String password = sh.getRow(0).getCell(1).getStringCellValue();
	 PBPwdPage3 pwd=new PBPwdPage3(driver);
	 pwd.enterPwd(password);
	 pwd.clickOnSignInBtn();
	 Thread.sleep(1000);
	 
	 PBHomePage3 home=new PBHomePage3(driver);
	 home.openMyAccDropDownOptions();
	 Thread.sleep(1000);
	 
	 PBMyAccPage3 myAcc=new PBMyAccPage3(driver);
	 myAcc.clickOnMyProfile();
	 Thread.sleep(500);
	 
	 PBProfilePage3 profile=new PBProfilePage3(driver);
	 profile.switchToSwitchChildWindow();
	 
	 String expName = sh.getRow(0).getCell(2).getStringCellValue();
	 profile.verifyFullName(expName);
	 Thread.sleep(1000);
	 
	 driver.quit();
	}
}
