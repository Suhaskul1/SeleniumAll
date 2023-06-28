package POMPagefactory2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBMainClass2 {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.policybazaar.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  PBLoginPage1 login=new PBLoginPage1(driver);
	  login.clickOnSignIn();
	  
	  PBmobNoPage2 mobNum= new PBmobNoPage2(driver);
	  mobNum.entermobNo();
	  mobNum.clickOnSignInWithPwd();
	  Thread.sleep(2000);
	  
	  PBPwdPage2 pwd=new PBPwdPage2(driver);
	  pwd.enterPwd();
	  pwd.clickOnSign();
	  Thread.sleep(1000);
	  
	  PBHomePage2 home=new PBHomePage2(driver);
	  home.moveTomyAcc();
	  
	  PBmyAccpage2 myacc=new PBmyAccpage2(driver);
	  myacc.clickOnMyProfile();
	  Thread.sleep(1000);
	  
	  PBmyProfilepage2 profile=new PBmyProfilepage2(driver);
	  profile.switchToChild();
	  profile.verifyFullName();
	  Thread.sleep(2000);
	  
	  driver.quit();
	}
}
