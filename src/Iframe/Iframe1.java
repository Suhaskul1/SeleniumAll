package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
	  
	  //switch to iframe
	  
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
	}
}
