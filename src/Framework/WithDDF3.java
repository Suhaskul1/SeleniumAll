package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithDDF3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
	 FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.policybazaar.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	 String mobno = sh.getRow(0).getCell(0).getStringCellValue();
	 driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mobno);
	 
	 driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	 Thread.sleep(2000);
	 
	 String pswd = sh.getRow(0).getCell(1).getStringCellValue();
	 driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(pswd);
	 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	 Thread.sleep(2000);
	 //move to elemnt
	 WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
	 
	 Actions act=new Actions(driver);
	 act.moveToElement(myacc).perform();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	 
	 //switch to child window
	 
	 Set<String> allid = driver.getWindowHandles();
	 ArrayList<String> al=new ArrayList<>(allid);
	 driver.switchTo().window(al.get(1));
	 
	 //get attribute value
	 String actText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	 String expText = sh.getRow(0).getCell(2).getStringCellValue();
	 
	 if(actText.equals(expText))
	 {
		 System.out.println("TC Pass");
	 }
	 else {
		 System.out.println("TC Failed");
	 }
	 Thread.sleep(1000);
	 //driver.quit();
	 driver.switchTo().window(al.get(0));
	 Thread.sleep(2000);
	 
	 //scroll to bottom element
	 WebElement more = driver.findElement(By.xpath("//a[text()='Know more']"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",more);
	}
}
