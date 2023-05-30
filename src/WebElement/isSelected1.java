package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected1 {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	  
	  Thread.sleep(2000);
	  WebElement chkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
	  
	  chkbox1.click();
	  
	  boolean res = chkbox1.isSelected();
	  
	  System.out.println(res);
	  if(res)
	  {
		  System.out.println("button selected");
	  }
	  else
	  {
		  System.out.println("not selected");
	  }
	}
}
