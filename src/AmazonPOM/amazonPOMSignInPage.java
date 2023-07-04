package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPOMSignInPage {

	WebDriver driver1;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement accountAndList;
	@FindBy(xpath="//span[@class='nav-action-inner']")private WebElement signIn;
	
	public amazonPOMSignInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
		
	}
	
	public void moveToSignIn()
	{
       Actions act= new Actions(driver1);
       act.moveToElement(accountAndList).perform();
	}
	
	public void clickOnSignIn()
	{
		signIn.click();
	}
}
