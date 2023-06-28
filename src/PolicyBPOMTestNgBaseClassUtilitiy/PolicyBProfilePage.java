package PolicyBPOMTestNgBaseClassUtilitiy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBProfilePage {

	WebDriver driver1;
	
	@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
	@FindBy(xpath="//input[@name='email']")private WebElement EId;
	@FindBy(xpath="//div[@title='Logout']")private WebElement logOut;
	
	public PolicyBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToChildWindow() throws IOException, InterruptedException
	{
	 Set<String> allid = driver1.getWindowHandles();
	 ArrayList<String> al=new ArrayList<String>(allid);
	 
	 driver1.switchTo().window(al.get(1));
	 Thread.sleep(2000);
	}
	
	public String getFullName()
	{
		String actName = fullName.getAttribute("value");
		return actName;
	}
	
	public String getEmailId()
	{
		String actEid=EId.getAttribute("value");
		return actEid;
	}
	
	
//	public void verifyFullName(String expName)
//	{
//		String actName = fullName.getAttribute("value");
//		
//		
//		if(actName.equals(expName))
//		{
//			System.out.println("TC Pass");
//		}
//		else
//		{
//			System.out.println("TC Failed");
//		}
//	}
}
