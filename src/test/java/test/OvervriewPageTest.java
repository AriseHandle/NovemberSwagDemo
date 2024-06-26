package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabCartPage;
import pom.SwagLabCheckoutOverview;
import pom.SwagLabCheckoutPage;
import pom.SwagLabHomePage;

public class OvervriewPageTest extends BaseTest {

	@Parameters({"browser"})
	
	@BeforeMethod
	public void OpenApplication(String browser) {
		driver =Browser.launchBrowser(browser);
	}
	
	@Test
	public void overViewPagePriceCalculationTest() {
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		
		swagLabHomePage.addProductToCart(0);
		swagLabHomePage.addProductToCart(1);
		swagLabHomePage.clickOnCartButton();
		
		SwagLabCartPage swagLabCartPage =new SwagLabCartPage(driver);
		swagLabCartPage.clickOnCheckoutButton();
		
		SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(driver);
		swagLabCheckoutPage.enterFirstname("Arise");
		swagLabCheckoutPage.enterLastname("Pune");
		swagLabCheckoutPage.enterPostalCode("411032");
		swagLabCheckoutPage.clickOnContinueButton();
		
		SwagLabCheckoutOverview swagLabCheckoutOverview =new SwagLabCheckoutOverview(driver);
		double firstPrice =swagLabCheckoutOverview.getProductPrice(0);
		double secondPrice = swagLabCheckoutOverview.getProductPrice(1);
		double totalPrice =swagLabCheckoutOverview.getItemTotalPrice();
		Assert.assertEquals(totalPrice, (firstPrice+secondPrice));
		Assert.assertEquals(swagLabCheckoutOverview.getItemTotalPriceWithTax(), swagLabCheckoutOverview.getTotalTaxPrice()+totalPrice);
	
		
		
		
		
		
		
	}
	
}
