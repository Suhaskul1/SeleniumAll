package PolicyBPOMTestNgBaseClassUtilitiy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBPOMSignoutPage {
	
	WebDriver driver1;
	@FindBy(xpath="//span[text()='Sign out']")private WebElement signOut;
	public PolicyBPOMSignoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToHomePage()
	{
		Set<String> allids = driver1.getWindowHandles();
		ArrayList<String> al1= new ArrayList<>(allids);
		
		driver1.switchTo().window(al1.get(0));
	}
	
	public void clickOnSignOut()
	{
		signOut.click();
	}
}
