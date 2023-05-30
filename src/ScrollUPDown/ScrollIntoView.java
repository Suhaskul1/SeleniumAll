package ScrollUPDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      
      WebElement plus = driver.findElement(By.xpath("//h2[text()='Flipkart Plus']"));
      Thread.sleep(2000);
      
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",plus);
	}
}
