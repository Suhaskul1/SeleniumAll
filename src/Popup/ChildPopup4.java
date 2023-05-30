package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup4 {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();	
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/java/java_methods.asp");
	  
	  driver.findElement(By.xpath("(//a[@class='w3-btn'])[1]")).click();;
	  
	  Set<String> allid = driver.getWindowHandles();
	  
	  ArrayList<String> al = new ArrayList<String>(allid);
	  
	  String childindex = al.get(1);
	  
	  driver.switchTo().window(childindex);
	  
	  driver.findElement(By.xpath("//button[@id='runbtn']")).click();
	}
}
