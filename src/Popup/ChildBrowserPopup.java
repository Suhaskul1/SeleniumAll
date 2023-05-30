package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://skpatro.github.io/demo/links/");
	  driver.manage().window().maximize();
	  
	  //click on new tab of this page
	  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	  
	  //get child window ID
	  
	  Set<String> allIds = driver.getWindowHandles();
	  //main page ID, child window ID
	  ArrayList<String> al=new ArrayList(allIds);
	  
	  //main page ID(0), Child window ID(1)
	  
	  String childwindowId = al.get(1);
	  
	  //switch to child window
	  driver.switchTo().window(childwindowId);
	  
	  //click on training tab
	  driver.findElement(By.xpath("//span[text()='Training']")).click();
	}
}

