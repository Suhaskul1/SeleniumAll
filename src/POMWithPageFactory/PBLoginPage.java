package POMWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage {

	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIn;
	
	//step2: initialization
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3: usage
	public void clickOnSignInBtn()
	{
		signIn.click();
	}
}
