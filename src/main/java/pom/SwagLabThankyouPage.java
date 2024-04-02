package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabThankyouPage
{
	@FindBy(xpath="//h2[text()='Thank you for your order!']")private WebElement thankyouMessage;
	@FindBy(xpath="//div[@data-test='complete-text']")private WebElement orderPlacedMessage;
	@FindBy(xpath="//button[@id='back-to-products']")private WebElement backHomeButton;
	@FindBy(xpath="//span[text()='Checkout: Complete!']")private WebElement checkoutComplete;
	
	public SwagLabThankyouPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getThankyouMessage()
	{
		 return thankyouMessage.getText();
	}
	
	public String getPlaceOrderMessage()
	{
		 return orderPlacedMessage.getText();
	}
	
	public void clickBackHomeButton()
	{
		backHomeButton.click();
	}
	
	public String confirmCheckoutCompletePageTitle()
	{
		return checkoutComplete.getText();
	}
}
