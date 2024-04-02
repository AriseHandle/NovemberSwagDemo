package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabHomePage;
import utility.Parametrization;

public class socialMediaLinkTest extends BaseTest
{
	private String user;
	private String pass;
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
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterrate =handles.iterator();
		while(iterrate.hasNext())
		{
			String handle =iterrate.next();
			driver.switchTo().window(handle);			
		}
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://twitter.com/saucelabs", url);		
	}
	
	@Test
	public void clickOnFacebookButton()
	{
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnFacebookButton();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterrate =handles.iterator();
		while(iterrate.hasNext())
		{
			String handle =iterrate.next();
			driver.switchTo().window(handle);			
		}
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.facebook.com/saucelabs", url);		
	}
	
	@Test
	public void clickOnLinkedINButton()
	{
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, "standard_user", "secret_sauce");
		SwagLabHomePage swagLabHomePage =new SwagLabHomePage(driver);
		swagLabHomePage.clickOnLinkedINButton();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterrate =handles.iterator();
		while(iterrate.hasNext())
		{
			String handle =iterrate.next();
			driver.switchTo().window(handle);			
		}
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.linkedin.com/company/sauce-labs/", url);		
	}
}
