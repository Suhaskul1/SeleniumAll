package PolicyBPOMTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBPwdPage {

	@FindBy(xpath="//input[@name='password']")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	public PolicyBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickOnSignIn()
	{
		signIn.click();
	}
}
