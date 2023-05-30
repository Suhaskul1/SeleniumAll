package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallLinks2 {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	  System.out.println(alllinks.size());
	  
	  for(WebElement s1:alllinks)
	  {
		  System.out.println(s1.getText());
	  }
	  
	  
	}
}
