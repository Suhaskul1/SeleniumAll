package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup2 {

	public static void main(String[] args)
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://skpatro.github.io/demo/links/");
	  
	  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	  //get all  ID
	  
	  Set<String> allID = driver.getWindowHandles();
	  
	  ArrayList<String> al=new ArrayList(allID);
	  //get child window ID
	  String childID = al.get(1);
	  //switch to child window
	  
	  driver.switchTo().window(childID);
	  
	  //click on training tab
	  driver.findElement(By.xpath("//span[text()='Training']")).click();
	}
}
