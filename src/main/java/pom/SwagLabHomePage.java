package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy (xpath="//button[text()='Open Menu']")private WebElement menu;
	@FindBy (xpath="//a[text()='About']")private WebElement about;
	@FindBy (xpath="//a[text()='Logout']")private WebElement logout;
	@FindBy (xpath="//a[@href='./cart.html']")private WebElement cart;
	
	@FindBy (xpath="//select[@class='product_sort_container']")private WebElement filter; //products to be selected
	
	@FindBy (xpath="//button[text()='ADD TO CART']")private WebElement addToCart;
	@FindBy (xpath="//button[text()='REMOVE']")private WebElement remove;
	
	@FindBy (xpath="//li[text()='Twitter']")private WebElement twitter;
	@FindBy (xpath="//li[text()='Facebook']")private WebElement facebook;
	@FindBy (xpath="//li[text()='LinkedIn']")private WebElement linkedIn;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void menuButton()
	{
		menu.click();
	}
	
	public void aboutButton()
	{
		about.click();
	}
	
	public void logoutButton()
	{
		logout.click();
	}
	
	public void cartButton()
	{
		cart.click();
	}
	
	public void filterDropDown()
	{
		//
	}
	
	public void addToCartButton()
	{
		addToCart.click();
	}
	
	public void removeButton()
	{
		remove.click();
	}
	
	

}
