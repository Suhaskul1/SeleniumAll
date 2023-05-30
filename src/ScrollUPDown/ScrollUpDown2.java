package ScrollUPDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown2 {

	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	 
	 Thread.sleep(1000);
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
	
	}
}
