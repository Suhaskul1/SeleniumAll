package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectOptionFromSingleSelect {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	  Thread.sleep(2000);
	  
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  
	  Select s = new Select(month);
	  //s.selectByVisibleText("sep");
	  s.selectByValue("6");
	  //s.selectByIndex(7);
	}
}
