package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.com/");
	  
	  driver.manage().window().maximize();
	  
	  WebElement cap=driver.findElement(By.xpath("//input[@id='captchacharacters']"));
	  cap.sendKeys("hello");
	  
	  cap.clear();
	  Thread.sleep(1000);
	  cap.sendKeys("Byeeee");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  //WebElement UN=driver.findElement(By.xpath("//a[text()='Sign in securely']"));
	  
	  //UN.click();
	  
	  
	  
	  
	}
}
