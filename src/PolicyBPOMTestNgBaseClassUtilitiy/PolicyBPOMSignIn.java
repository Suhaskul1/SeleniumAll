package PolicyBPOMTestNgBaseClassUtilitiy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBPOMSignIn {

	@FindBy(xpath="//a[text()='Sign in']")private WebElement signIn;
	
	public PolicyBPOMSignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignin()
	{
		signIn.click();
	}
}
