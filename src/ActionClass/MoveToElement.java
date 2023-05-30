package ActionClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args)
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //click on close button
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  
	  WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	  
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(login).perform();
	}
}
