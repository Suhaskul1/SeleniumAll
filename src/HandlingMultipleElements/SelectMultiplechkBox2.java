package HandlingMultipleElements;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultiplechkBox2 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.meesho.com/ethnicwear-women/pl/3tq");
	  driver.manage().window().maximize();
	  
	  List<WebElement> alllinks = driver.findElements(By.xpath("//span"));
	  System.out.println(alllinks.size());
	  
	  for(WebElement s1:alllinks)
	  {
		  s1.click();
		  Thread.sleep(2000);
		  
		 
	  }
	}
}
