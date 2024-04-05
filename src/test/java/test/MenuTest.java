package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabHomePage;
import utility.Parametrization;

public class MenuTest extends BaseTest{

@Parameters({"browser"})
	
	@BeforeMethod
	public void OpenApplication(String browser) {
		driver =Browser.launchBrowser(browser);
	}
	
	@Test
	public void verifyAbout() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnMenuButton();
		swagLabHomePage.clickOnAboutButton();
		String title=driver.getTitle();
		Assert.assertEquals("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing", title);
	}
	
	@Test
	public void verifyLogout() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnMenuButton();
		swagLabHomePage.clickOnlogoutButton();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/", url);
	}
	
}
