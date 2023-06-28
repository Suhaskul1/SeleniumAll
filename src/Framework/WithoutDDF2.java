package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutDDF2 {

	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.policybazaar.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	 
	 driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9325528587");
	 
	 driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kulkarnisos@01");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	 
	 Thread.sleep(1000);
	 
	 WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
	 Actions act=new Actions(driver);
	 act.moveToElement(myacc).perform();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	 
	 Set<String> allid = driver.getWindowHandles();
	 
	 ArrayList<String> al=new ArrayList<String>(allid);
	 
	 String childid = al.get(1);
	 
	 driver.switchTo().window(childid);
	 Thread.sleep(2000);
	 
	 String actText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	 String expText="sameer";
	 
	 if(actText.equals(expText))
	 {
		 System.out.println("TC Pass");
	 }
	 else
	 {
		 System.out.println("TC Failed");
	 }
	 Thread.sleep(1000);
	 
	 driver.quit();
	}
}
