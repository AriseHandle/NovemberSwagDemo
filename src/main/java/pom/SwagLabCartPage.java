package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCartPage 
{
	@FindBy(xpath="//button[@id='continue-shopping']")private WebElement continueShopping;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkoutButton;	
	@FindBy(xpath="//div[@data-test='inventory-item']")private List<WebElement> productInCart; 
	@FindBy(xpath="//div[@data-test='inventory-item']//div//a//div")private List<WebElement> cartProductName;
	@FindBy(xpath="//div[@data-test='inventory-item-price']")private List<WebElement> cartProductPrice; 
	@FindBy(xpath="//div[@data-test='inventory-item-desc']")private List<WebElement> cartProductDescription;
	
	public SwagLabCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinueShoppingButton()
	{
		continueShopping.click();
	}
	
	public void clickOnCheckoutButton()
	{
		checkoutButton.click();		
	}
	
}
