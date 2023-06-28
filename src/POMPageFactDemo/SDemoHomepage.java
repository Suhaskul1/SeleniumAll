package POMPageFactDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SDemoHomepage {

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement addcart;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement carticon;
	
	public SDemoHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddCart()
	{
		addcart.click();
	}
	
	public void clickOnCarticon()
	{
		carticon.click();
	}
}
