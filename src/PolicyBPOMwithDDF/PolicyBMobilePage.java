package PolicyBPOMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBMobilePage {
	
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInwithPwd;

	public PolicyBMobilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobilenum(String mobileNum)
	{
		mobNum.sendKeys(mobileNum);
	}
	
	public void clickOnSignInwithpwd()
	{
		signInwithPwd.click();
	}
}
