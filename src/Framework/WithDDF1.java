package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithDDF1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
	 FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.policybazaar.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	 
	 //enter mobile number
	 String mobno = sh.getRow(0).getCell(0).getStringCellValue();
	 driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(mobno);
	 driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	 
	 //enter password
	 String pswd = sh.getRow(0).getCell(1).getStringCellValue();
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
	 
	 //click on sign in button
	 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	 
	 //move to myacc
	 
	 WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
	 
	 Actions act=new Actions(driver);
	 Thread.sleep(2000);
	 act.moveToElement(myacc).perform();
	 driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	 
	 Set<String> allid = driver.getWindowHandles();
	 ArrayList<String> al=new ArrayList<String>(allid);
	 driver.switchTo().window(al.get(1));
	 
	 String actText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	 String expText = sh.getRow(0).getCell(2).getStringCellValue();
	 
	 if(actText.equals(expText))
	 {
		 System.out.println("TC Pass");
	 }
	 else
	 {
		 System.out.println("TC Failed");
	 }
	 Thread.sleep(2000);
	 driver.quit();
	}
}
