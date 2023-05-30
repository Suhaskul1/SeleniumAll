package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BuildPerform {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.flipkart.com/");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  
		  WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		  WebElement more = driver.findElement(By.xpath("/div[@class='exehdJ']"));
		  
		  Actions act=new Actions(driver);
		  
		  Action seriesOfActions=(Action)act.moveToElement(login).click(more).build();
		  
		  seriesOfActions.perform();
		  
		  
	}
}
