package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.myntra.com/");
	  driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Sung");
	  
	  List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
	  
	  String expText="Sunglasses Fastrack";
	  
	  for(WebElement s1: alloptions)
	  {
		  String actText=s1.getText();
		  if(actText.equals(expText))
		  {
			  s1.click();
			  break;
		  }
	  }
	  
	}
}
