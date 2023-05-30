package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClear {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.meesho.com/");
	  
	  driver.manage().window().maximize();
	  WebElement pc=driver.findElement(By.xpath("//input[@color='greyBase']"));
	  pc.sendKeys("Kurta");
	  Thread.sleep(2000);
	  pc.clear();
	  
	  
	  pc.sendKeys("saree");
	  
	  driver.navigate().back();
	}
}
