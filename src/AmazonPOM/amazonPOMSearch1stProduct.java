package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPOMSearch1stProduct {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchBar;
	@FindBy(xpath="//input[@type='submit']")private WebElement goBTN;
	public amazonPOMSearch1stProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void serachProduct()
	{
		searchBar.sendKeys("redmi note 12");
	}
	public void clickOnGobtn()
	{
		goBTN.click();
	}
}
