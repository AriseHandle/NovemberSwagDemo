package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
@FindBy (xpath="//button[@id='checkout']")private WebElement checkOut;
@FindBy (xpath="//button[@id='continue-shopping']")private WebElement continueShopping;
@FindBy (xpath="//button[@class='btn btn_secondary btn_small cart_button']']")private List<WebElement> remove;
@FindBy (xpath="//div[@class='cart_item']")private List<WebElement> product;

public AddToCartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
public void clickRemoveButton(int index) {
	remove.get(index).click();
}
public void clickCheckoutButton() {
	checkOut.click();
}
public void clickOnContinueShopping() {
	continueShopping.click();
}
public void verifyCountOfProductInCart() {
	
}
}




