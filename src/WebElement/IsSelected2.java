package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected2 {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.amazon.in/");
	 driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	 
	 Thread.sleep(2000);
	 
	 WebElement chkbox = driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"));
	 
	 chkbox.click();
	 
	 boolean res = chkbox.isSelected();
	 System.out.println(res);
	 
	 if(res)
	 {
		 System.out.println("checkbox is selected");
	 }
	 else
	 {
		 System.out.println("not selected");
	 }
	 
	}
}
