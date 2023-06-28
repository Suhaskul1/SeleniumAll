package PolicyBPOMTestNgBaseClassUtilitiy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBMyaccPage {

	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
	
	public PolicyBMyaccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProfile()
	{
		myProfile.click();
	}
}
