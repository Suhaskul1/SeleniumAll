package PolicyBPOMTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBHomePage {

	WebDriver driver1;
	@FindBy(xpath="//div[text()='My Account']")private WebElement myAcc;
	
	public PolicyBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void clickOnMyacc()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(myAcc).perform();
	}
	
}
