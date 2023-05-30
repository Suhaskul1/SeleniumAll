package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345"); 
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	 //to get text from alert box
	  String text = driver.switchTo().alert().getText();
	  System.out.println(text);
	  
	  //to click on 'ok button' of 1st alert box
	  driver.switchTo().alert().accept();
	  
	//to click on 'ok button' of 2nd alert box
	  driver.switchTo().alert().accept();
	  
	  //to dismiss or cancel alert box
	  //driver.switchTo().alert().dismiss();
	}
}
