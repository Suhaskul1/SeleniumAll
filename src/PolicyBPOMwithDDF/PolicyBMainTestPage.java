package PolicyBPOMwithDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolicyBMainTestPage {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PolicyBPOMSignIn SignIn=new PolicyBPOMSignIn(driver);
		SignIn.clickOnSignin();
		
		String mobileNum = sh.getRow(0).getCell(0).getStringCellValue();
		PolicyBMobilePage mobNum=new PolicyBMobilePage(driver);
		mobNum.enterMobilenum(mobileNum);
		mobNum.clickOnSignInwithpwd();
		
		Thread.sleep(1000);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		PolicyBPwdPage passwrd= new PolicyBPwdPage(driver);
		passwrd.enterPassword(password);
		passwrd.clickOnSignIn();
		Thread.sleep(2000);
		
		PolicyBHomePage home=new PolicyBHomePage(driver);
		home.clickOnMyacc();
		Thread.sleep(1000);
		
		PolicyBMyaccPage myacc=new PolicyBMyaccPage(driver);
		myacc.clickOnProfile();
		Thread.sleep(1000);
		
		PolicyBProfilePage profile=new PolicyBProfilePage(driver);
		profile.switchToChildWindow();
		Thread.sleep(1000);
		
		String expName=sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyFullName(expName);
		Thread.sleep(1000);
		
		driver.quit();
	
}
}
