package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText3 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  
		  String text = driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart')]")).getText();
		  
		  System.out.println(text);
	}
}
