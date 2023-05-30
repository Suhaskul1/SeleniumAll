package HandlingOfDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrowsizeinTable {

	public static void main(String[] args) 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("file:///C:/Users/Dell/Downloads/sample1.html");
	 
	 int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
	 
	 System.out.println(rowsize);
	}
}
