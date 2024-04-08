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
import pom.SwagLabThankyouPage;

public class ThankYouPageTest extends BaseTest {
@Parameters({"browser"})
	
	@BeforeMethod
	public void OpenApplication(String browser) {
		driver =Browser.launchBrowser(browser);
	}

@Test
public void verifyThankYouPageMessageFunctionality()
{
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
	swagLabCheckoutOverview.clickOnFinishButton();
	
	SwagLabThankyouPage swagLabThankyouPage = new SwagLabThankyouPage(driver);
	String thankYouMessage = swagLabThankyouPage.getThankyouMessage();
	Assert.assertEquals(thankYouMessage, "Thank you for your order!");
}

	@Test
	public void verifytThankYouPagePlaceOrderMessage()
	{
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
		swagLabCheckoutOverview.clickOnFinishButton();
		
		SwagLabThankyouPage swagLabThankyouPage = new SwagLabThankyouPage(driver);
		String placeOrderMessage = swagLabThankyouPage.getPlaceOrderMessage();
		Assert.assertEquals(placeOrderMessage, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
				
	}
	
	@Test
	public void clickOnBackHomeButtonFunctionality()
	{
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
		swagLabCheckoutOverview.clickOnFinishButton();
		
		SwagLabThankyouPage swagLabThankyouPage = new SwagLabThankyouPage(driver);
		swagLabThankyouPage.clickBackHomeButton();
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html");
		
	}
}
