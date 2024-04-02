package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabCheckoutPage
{
	@FindBy(xpath="//input[@id='first-name']")private WebElement firstName;
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement postalCode;
	@FindBy(xpath="//button[@id='cancel']")private WebElement cancelButton;
	@FindBy(xpath="//input[@id='continue']")private WebElement contonueButton;
	@FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement checkoutPageName;
	
	public SwagLabCheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterFirstname(String fname)
	{
		firstName.sendKeys(fname);
	}
	public void enterLastname(String lname)
	{
		firstName.sendKeys(lname);
	}
	public void enterPostalCode(String pinCode)
	{
		firstName.sendKeys(pinCode);
	}
	public void clickOnCancelButton()
	{
		cancelButton.click();
	}
	
	public void clickOnContinueButton()
	{
		contonueButton.click();
	}
	
	public String getCheckoutpage()
	{
		 return checkoutPageName.getText();
	}
}
