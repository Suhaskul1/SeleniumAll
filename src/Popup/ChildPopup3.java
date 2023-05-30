package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup3 {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/java/java_methods.asp");
	  
	  driver.findElement(By.xpath("(//a[@class='w3-btn'])[1]")).click();
	  
	  //get child window ID
	  Set<String> allid = driver.getWindowHandles();
	  
	  //passing all ID into arraylist to get index of first 2 ids(main page, child page)
	  ArrayList<String> al=new ArrayList<String>(allid);
	  //main page(0), child page(1)
	  
	  String childindex = al.get(1);
	  
	  //switch to child window
	  driver.switchTo().window(childindex);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='runbtn']")).click();
	  
	}
}
