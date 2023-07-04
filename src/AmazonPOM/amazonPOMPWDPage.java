package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPOMPWDPage {

	@FindBy(xpath="//input[@id='ap_password']")private WebElement pswdField;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement pwdSignIn;
	public amazonPOMPWDPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword()
	{
		pswdField.sendKeys("Soskul@9325");
	}
	
	public void clickOnpwdSignIn()
	{
		pwdSignIn.click();
	}
}
