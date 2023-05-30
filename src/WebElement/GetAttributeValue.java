package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();	
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//a[text()='Sign in securely']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("hellooo");
	  
	  Thread.sleep(2000);
	  
	  String text = driver.findElement(By.xpath("//input[@id='ap_email']")).getAttribute("value");
	  
	  System.out.println(text);
	  
	}
}
