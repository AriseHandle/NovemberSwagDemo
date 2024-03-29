package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy (xpath="//button[text()='Open Menu']") private WebElement menubutton;
	@FindBy (xpath="//a[text()='All Items']") private WebElement allitems;
	@FindBy (xpath="//a[text()='About']]") private WebElement about;
	@FindBy (xpath="//a[text()='Logout']") private WebElement logout;
	
	
	@FindBy (xpath="//a[@href='./cart.html']")private WebElement cart;
	@FindBy (xpath="//button[text()='ADD TO CART']")private WebElement addtocart;
	@FindBy (xpath="//button[text()='REMOVE']")private WebElement remove;
	@FindBy (xpath="//select[@class='product_sort_container']")private WebElement filter;
	
	@FindBy (xpath="//li[text()='Twitter']")private WebElement twitter;
	@FindBy (xpath="//li[text()='Facebook']")private WebElement facebook;
	@FindBy (xpath="//li[text()='LinkedIn']")private WebElement linkedIn;
	
	public SwagLabHomePage(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
	}
	
	public void menuButton()
	{
		menubutton.click();
	}
	
	
	public void allItems() 
	{
		allitems.click();
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
	
	
	public void addToCart()
	{
		addtocart.click();
	}
	
	public void removeButton()
	{
		remove.click();
	}
	
	public void filterDropDown()
	{
		filter.click();
	}
	
	

}
