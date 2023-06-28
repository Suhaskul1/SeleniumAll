package POMPagefactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage1 {

	@FindBy(xpath="//a[text()='Sign in']")private WebElement signIn;
	
	public PBLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn()
	{
		signIn.click();
	}
}
