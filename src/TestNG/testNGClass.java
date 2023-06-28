package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGClass {

	//We need main method to execute the program, but using TestNG class we are able to execute the program with normal method
	@Test
	public void m1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.close();
	}
}
