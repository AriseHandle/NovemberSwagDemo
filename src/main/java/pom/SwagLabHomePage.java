package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SwagLabHomePage {
	
	@FindBy (xpath="//button[text()='Open Menu']")private WebElement menu;
	@FindBy (xpath="//a[text()='About']")private WebElement about;
	@FindBy (xpath="//a[text()='Logout']")private WebElement logout;
	@FindBy (xpath="//a[@href='./cart.html']")private WebElement cart;
	@FindBy (xpath="//select[@class='product_sort_container']")private WebElement filter; //products to be selected
	@FindBy (xpath="//button[text()='Add to cart']")private List<WebElement> addToCart;
	@FindBy (xpath="//button[text()='Remove']")private List<WebElement> remove;
	@FindBy (xpath="//li[text()='Twitter']")private WebElement twitter;
	@FindBy (xpath="//li[text()='Facebook']")private WebElement facebook;
	@FindBy (xpath="//li[text()='LinkedIn']")private WebElement linkedIn;
	@FindBy (xpath="//div[@class='inventory_item_price']")private List<WebElement> productPrice;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenuButton()
	{
		menu.click();
	}
	
	public void clickOnAboutButton()
	{
		about.click();
	}
	
	public void clickOnlogoutButton()
	{
		logout.click();
	}
	
	public void clickOnCartButton()
	{
		cart.click();
	}
	
	public void selectFilterDropDown(int index)
	{
		Select select = new Select(filter);
		select.selectByIndex(index);
	}
	
	public void addProductToCart(int index)
	{
		addToCart.get(index).click();
	}
	
	public void removeProductFromCart(int index)
	{
		remove.get(index).click();
	}
	
	public double[]  getProductPrice() {
		double [] allProductPrice = new double [6];
		for(int i =0; i<productPrice.size();i++)
		{
		String price = productPrice.get(i).getText();
		String data =price.substring(1);
		allProductPrice[i] =Double.parseDouble(data);
		}
		return  allProductPrice;
	}
	
	public int getAddtocartButtonCount()
	{	
		
		return addToCart.size();	 
	}
	
	public int getRemoveButtonCount()
	{	
		return remove.size();	 
	}
	
	
	

}
