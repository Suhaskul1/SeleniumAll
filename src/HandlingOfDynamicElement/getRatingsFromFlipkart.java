package HandlingOfDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRatingsFromFlipkart {

	public static void main(String[] args)
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  
	  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  
	  String ratings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
	  
	  System.out.println(ratings);
	}
}
