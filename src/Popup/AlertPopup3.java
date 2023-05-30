package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup3 {

	public static void main(String[] args)
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcd");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();
	}
}
