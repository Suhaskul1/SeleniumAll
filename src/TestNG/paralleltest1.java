package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltest1 {

	@Test
	public void facebook() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
}
