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
	@FindBy(xpath="//div[@data-test='inventory-item']")private List<WebElement> cartProductContainer; 
	@FindBy(xpath="//div[@data-test='inventory-item']//div//a//div")private List<WebElement> cartProductName;
	@FindBy(xpath="//div[@data-test='inventory-item-price']")private List<WebElement> cartProductPrice; ////div//div//div//div//div//div[@data-test='inventory-item-price']
	@FindBy(xpath="//div[@data-test='inventory-item-desc']")private List<WebElement> cartProductDescription;
	//xpath = //*[contains(@class,"item")]//div[contains(@class,"label")]//div[contains(@class,"desc")]
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
