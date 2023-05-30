package HandlingCustmizeListBoxByKeyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	 
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 
	 Actions act=new Actions(driver);
	 
	 act.click(month).perform();
	 Thread.sleep(2000);
	 
	 act.sendKeys(Keys.HOME).perform();
	 Thread.sleep(2000);
	 for(int i=1; i<=7; i++)
	 {
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
	 }
	 act.sendKeys(Keys.ENTER).perform();
	}
}
