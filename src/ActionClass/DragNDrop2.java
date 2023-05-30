package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop2 {

	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	 
	 WebElement srcEle = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	 WebElement desEle = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
	 
	// WebElement srcEle1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	 //WebElement desEle1 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
	 
	 Actions act=new Actions(driver);
	 act.dragAndDrop(srcEle, desEle).perform();
	 
	 Thread.sleep(2000);
	 
	 //act.dragAndDrop(srcEle1, desEle1).perform();	
	}
}
