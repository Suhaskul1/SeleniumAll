package POMwithDDF_BaseClass_UtilityCls_ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage3 {

	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIn;
	
	//step2: initialization
	public PBLoginPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3: usage
	public void clickOnSignInBtn()
	{
		signIn.click();
	}
}
