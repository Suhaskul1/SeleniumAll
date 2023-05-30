package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();	
	  
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  
	  boolean res = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).isEnabled();
	  
	  System.out.println(res);
	}
}
