package POMWithPageFactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PBProfilePage {

	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage(WebDriver driver)
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
	
	public void verifyFullName()
	{
		String actText = fullName.getAttribute("value");
		String expText="Suhas Kulkarni";
		
		if(actText.equals(expText))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Failed");
		}
	}
}
