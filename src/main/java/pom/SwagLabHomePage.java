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
	@FindBy (xpath="//a[@class='shopping_cart_link']")private WebElement cart;
	@FindBy (xpath="//select[@class='product_sort_container']")private WebElement filter; //products to be selected
	@FindBy (xpath="//button[text()='Add to cart']")private List<WebElement> addToCart;
	@FindBy (xpath="//button[text()='Remove']")private List<WebElement> remove;
	@FindBy (xpath="//a[text()='Twitter']")private WebElement twitter;
	@FindBy (xpath="//a[text()='Facebook']")private WebElement facebook;
	@FindBy (xpath="//a[text()='LinkedIn']")private WebElement linkedIn;
	@FindBy (xpath="//div[@class='inventory_item_price']")private List<WebElement> productPrice;
	@FindBy (xpath="//div[@class='inventory_item_name ']")private List<WebElement> productName;
	@FindBy (xpath="//div[@class='inventory_item_desc']")private List<WebElement> productDescription;
	
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

	public String getFirstProuctName() {
		return productName.get(0).getText();
	}
	
	public String getLastProductName() {
		return productName.get(productName.size()-1).getText();
	}
		
	public int getAddtocartButtonCount() {
		return addToCart.size();
	}
	
	public int getRemoveButtonCount() {
		return remove.size();
	}
	
	public void clickOnTwitterButton()
	{
		twitter.click();
	}
	public void clickOnFacebookButton()
	{
		facebook.click();
	}
	public void clickOnLinkedINButton()
	{
		linkedIn.click();
	}
	
	public String getProductName(int index) {
		return productName.get(index).getText();
	}
	
	public String getProductDescription(int index) {
		return productDescription.get(index).getText();
	}
	
	
	
	
	
}
