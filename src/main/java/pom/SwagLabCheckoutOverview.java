package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutOverview {

	@FindBy(xpath="//div[@class='cart_item']")private List <WebElement> productsInCheckout;
	@FindBy(xpath="//div[@class='inventory_item_name']")private List <WebElement> productName;
	@FindBy(xpath="//div[@class='inventory_item_desc']")private List <WebElement> productDescription;
	@FindBy(xpath="//div[@class='inventory_item_price']")private List <WebElement> productPrice;
	@FindBy(xpath="//div[@class='summary_subtotal_label']")private WebElement itemTotalPrice;
	@FindBy(xpath="//div[@class='summary_tax_label']")private WebElement totalTaxPrice;
	@FindBy(xpath="//div[@class='summary_total_label']")private WebElement itemTotalPriceWithTax;
	@FindBy(xpath="//button[@id='cancel']")private WebElement cancel;
	@FindBy(xpath="//button[@id='finish']")private WebElement finish;
	
	public SwagLabCheckoutOverview(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	public void verifyProductsInCheckout() {
		
	}
	
	public String[] getProductName(int index){
		String[] allProductName=new String[index];
		for (int i=0;i<productName.size();i++) {
			String product=productName.get(i).getText();
		}
		return allProductName;
	}
	
	public String[] getProductDescription(int index) {
		String[] allProducDescription=new String[index];
		for (int i=0;i<productDescription.size();i++) {
			String product=productDescription.get(i).getText();
		}
		return allProducDescription;
	}
	
    public double getProductPrice(int index) {
    	
		String price = productPrice.get(index).getText();
		String data =price.substring(1);
	    return Double.parseDouble(data);
		
		
	}
	
    public double getItemTotalPrice() {
		String price = itemTotalPrice.getText();
		String data =price.substring(13);
		double totalPrice = Double.parseDouble(data);
		return totalPrice;
	}
	
	public double getTotalTaxPrice() {
		String price = totalTaxPrice.getText();
		String data =price.substring(6);
		double taxPrice = Double.parseDouble(data);
		return taxPrice;
	}
	
	public double getItemTotalPriceWithTax() {
		String price = itemTotalPriceWithTax.getText();
		String data =price.substring(8);
		double productPriceWithTax = Double.parseDouble(data);
		return productPriceWithTax;
	}
	
	public void clickOnCancelButton() {
		cancel.click();
	}
	
	public void clickOnFinishButton() {
		finish.click();
	}
}