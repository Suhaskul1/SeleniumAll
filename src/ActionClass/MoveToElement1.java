package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement1 {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.amazon.in/");
	 
	 WebElement drop = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
	 
	 
	 Actions act=new Actions(driver);
	 Thread.sleep(2000);
	 act.moveToElement(drop).perform();
	 
	
	}
}
