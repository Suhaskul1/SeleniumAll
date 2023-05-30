package WebElement;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
	  WebDriver driver=new ChromeDriver();	
	  driver.get("https://www.facebook.com/");
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  System.out.println(src);
	  
	  File dest=new File("C:\\Users\\Dell\\Documents\\Screenshots\\abc.jpg");
	  
	  FileHandler.copy(src, dest);
	}
}
