package HandlingMultipleElements;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckbox {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	  
	  List<WebElement> allchkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	  
	  System.out.println(allchkbox.size());
	  
	  //To click all chk box
	  
	  for(WebElement s1:allchkbox)
	  {
		  s1.click();
		  Thread.sleep(3000);
	  }
	  
	  //To deselect all chk box above process + below loop
	  for(int i=allchkbox.size()-1; i>=0; i--)
	  {
		  allchkbox.get(i).click();
		  Thread.sleep(2000);
	  }
	}
}
