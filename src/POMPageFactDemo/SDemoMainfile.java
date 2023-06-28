package POMPageFactDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDemoMainfile {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");	
	  Sheet sh = WorkbookFactory.create(file).getSheet("SDemo");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  String Username = sh.getRow(0).getCell(0).getStringCellValue();
	  SDemoLoginpage userName= new SDemoLoginpage(driver);
	  userName.enterUsername(Username);
	  
	  String Password = sh.getRow(0).getCell(1).getStringCellValue();
	  SDemoLoginpage passWord=new SDemoLoginpage(driver);
	  passWord.enterPass(Password);
	  passWord.clickOnLogin();
	  Thread.sleep(1000);
	  
	  SDemoHomepage cart=new SDemoHomepage(driver);
	  cart.clickOnAddCart();
	  Thread.sleep(1000);
	  cart.clickOnCarticon();
	}
	
}
