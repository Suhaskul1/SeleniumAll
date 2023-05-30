package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.meesho.com/");
	  
	  driver.manage().window().maximize();
	  
	  String text = driver.findElement(By.xpath("//div[text()='Sign up now']")).getText();
	  
	  System.out.println(text);
	}
}
