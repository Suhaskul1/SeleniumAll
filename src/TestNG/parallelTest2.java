package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTest2 {

	@Test
	public void flipkart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
}
