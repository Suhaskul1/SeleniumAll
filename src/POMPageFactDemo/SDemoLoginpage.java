package POMPageFactDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SDemoLoginpage {

	@FindBy(xpath="//input[@id='user-name']") private WebElement userName;
	@FindBy(xpath="//input[@id='password']")private WebElement passWord;
	@FindBy(xpath="//input[@id='login-button']")private WebElement Login;
	
	public SDemoLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String Username)
	{
		userName.sendKeys(Username);
	}
	public void enterPass(String Password)
	{
		passWord.sendKeys(Password);
	}
	
	public void clickOnLogin()
	{
		Login.click();
	}
}
