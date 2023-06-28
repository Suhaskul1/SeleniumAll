package POMWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {

	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithpwd;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNum()
	{
		mobNum.sendKeys("9325528587");
	}
	
	public void clickOnSignInWithPwdBtn()
	{
		signInWithpwd.click();
	}
}
