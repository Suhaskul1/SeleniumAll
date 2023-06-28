package POMPagefactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBmobNoPage2 {

	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNo;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPwd;
	
	public PBmobNoPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entermobNo()
	{
		mobNo.sendKeys("9325528587");
	}
	public void clickOnSignInWithPwd()
	{
		signInWithPwd.click();
	}
}
