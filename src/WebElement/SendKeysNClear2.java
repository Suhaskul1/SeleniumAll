package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysNClear2 {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();	
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  
	  WebElement eid = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	  
	  eid.sendKeys("abcdef");
	  Thread.sleep(2000);
	  eid.clear();
	  eid.sendKeys("Hello");
	  driver.navigate().back();
	  
	}
}
