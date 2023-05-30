package ScrollUPDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown3 {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  Thread.sleep(2000);
	  
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
	}
}
