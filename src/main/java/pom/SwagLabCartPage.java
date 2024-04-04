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
	
	public int getProductInCart() {
		return	productInCart.size();
	}
	
	public String getProductNamePresentInCart(int index) {
		return cartProductName.get(index).getText();
	}
	
	public String getProductDescriptionPresentInCart(int index) {
		return cartProductDescription.get(index).getText();
	}
	
	public double getProductPricePresentInCart(int index) {
		
		String price = cartProductPrice.get(index).getText();
		String data =price.substring(1);
		return Double.parseDouble(data);
		
	}
	
}
