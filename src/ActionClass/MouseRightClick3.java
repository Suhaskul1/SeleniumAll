package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick3 {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  
	  WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	  
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  act.contextClick(mob).perform();
	}
}
