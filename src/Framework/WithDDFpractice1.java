package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithDDFpractice1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Documents\\WithDDF.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
	  driver.findElement(By.xpath("//button[@id='login']")).click();
	  Thread.sleep(2000);
	  //book page
	  
	  driver.findElement(By.xpath("//button[@id='gotoStore']")).click();

	}

	
	}

