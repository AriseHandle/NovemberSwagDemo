package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabCartPage;
import pom.SwagLabHomePage;

public class CartTest extends BaseTest {
	
	@BeforeMethod
	public void OpenApplication() {
		driver =Browser.launchBrowser();
	}
	
	@Test
	public void addSingleProductToCart() {
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.addProductToCart(0);
		String productName =swagLabHomePage.getProductName(0);
		String productDescription =swagLabHomePage.getProductDescription(0);
		double [] productPrice =swagLabHomePage.getProductPrice();
		swagLabHomePage.clickOnCartButton();
		
		SwagLabCartPage swagLabCartPage = new SwagLabCartPage(driver);
	    Assert.assertEquals(swagLabCartPage.getProductInCart(),1);
	    Assert.assertEquals(swagLabCartPage.getProductNamePresentInCart(0), productName);
		Assert.assertEquals(swagLabCartPage.getProductDescriptionPresentInCart(0), productDescription);
		Assert.assertEquals(swagLabCartPage.getProductPricePresentInCart(0), productPrice[0]);
		
		
	}

}
