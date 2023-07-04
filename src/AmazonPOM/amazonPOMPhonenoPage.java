package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPOMPhonenoPage {

	@FindBy(xpath="//input[@id='ap_email']")private WebElement phoneNo;
	@FindBy(xpath="//input[@id='continue']")private WebElement continueBTN;
	public amazonPOMPhonenoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPhoneNo()
	{
		phoneNo.sendKeys("9325528587");
	}
	
	public void clickOnContinuebtn()
	{
		continueBTN.click();
	}
}
