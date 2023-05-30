package ScrollUPDown;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 //scroll down
	 
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	 Thread.sleep(2000);
	 
	 //scrollUp
	 
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
	}
}
