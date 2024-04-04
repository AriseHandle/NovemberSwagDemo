package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabHomePage;
import utility.Parametrization;

public class SocialMediaLinkTest extends BaseTest
{
	
	@BeforeMethod
	public void OpenApplication() {
		driver =Browser.launchBrowser();
	}
	@Test
	public void clickOnTwitterButton()
	{
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnTwitterButton();
		switchToWindow("Sauce Labs (@saucelabs) / X");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://twitter.com/saucelabs");		
	}
	
	@Test
	public void clickOnFacebookButton()
	{
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnFacebookButton();
		switchToWindow("Sauce Labs | San Francisco CA | Facebook");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.facebook.com/saucelabs");		
	}
	
	@Test
	public void clickOnLinkedINButton()
	{
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnLinkedINButton();
		switchToWindow("Sauce Labs | LinkedIn");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.linkedin.com/company/sauce-labs/");		
	}
}
