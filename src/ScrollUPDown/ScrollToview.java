package ScrollUPDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToview {

	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 WebElement brand = driver.findElement(By.xpath("//a[text()='Brand Directory']"));
	 
	 Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", brand);
	}
}
