package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  
		  String text = driver.findElement(By.xpath("//button[text()='Request OTP']")).getText();
		  
		  System.out.println(text);
	}
}
