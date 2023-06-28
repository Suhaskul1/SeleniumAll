package POMWithPageFactDDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PBProfilePage3 {

	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToSwitchChildWindow()
	{
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allid);
		driver1.switchTo().window(al.get(1));
	}
	
	public void verifyFullName(String expName)
	{
		String actText = fullName.getAttribute("value");
		
		
		if(actText.equals(expName))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Failed");
		}
	}
}
