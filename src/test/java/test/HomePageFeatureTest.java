package test;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabHomePage;
import utility.Parametrization;

public class HomePageFeatureTest extends BaseTest {

	

	@BeforeMethod
	public void OpenApplication() {
		driver =Browser.launchBrowser();
	}
	
	@Test
	public void verifyFilterFunctionalityForLowToHigh() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, user, pass);
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.selectFilterDropDown(2);
		double [] price =swagLabHomePage.getProductPrice();
		Assert.assertTrue(price[0]<=price[1] && price[1]<=price[2] && price[2]<=price[3] && price[3]<=price[4] && price[4]<=price[5]);
	}
	

	@Test
	public void verifyFilterFunctionalityForHignToLow() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, user, pass);
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.selectFilterDropDown(3);
		double [] price =swagLabHomePage.getProductPrice();
		Assert.assertTrue(price[0]>=price[1] && price[1]>=price[2] && price[2]>=price[3] && price[3]>=price[4] && price[4]>=price[5]);
	}
	@Test
	public void verifyAddToCartButtonFunctionality() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.addProductToCart(0);
		int removeCount=swagLabHomePage.getRemoveButtonCount();
		Assert.assertEquals(removeCount, 1);
	}
	
	@Test
	public void verifyRemoveButtonFunctionality()throws InterruptedException   {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.addProductToCart(0);		
		swagLabHomePage.removeProductFromCart(0);
		int addToCartCount=swagLabHomePage.getAddtocartButtonCount();
		Assert.assertEquals(addToCartCount, 6);
	}
	
	@Test
	public void verifyFilterFunctionalityZToA() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		String firstProductName =swagLabHomePage.getFirstProuctName();
		String lastProductName = swagLabHomePage.getLastProductName();
		swagLabHomePage.selectFilterDropDown(1);
		Assert.assertEquals(swagLabHomePage.getLastProductName(),firstProductName );
		Assert.assertEquals(swagLabHomePage.getFirstProuctName(), lastProductName);
	}
}
