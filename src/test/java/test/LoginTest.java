package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import utility.Parametrization;

@Listeners (test.Listeners.class)
public class LoginTest extends BaseTest {
	
	String user;
	String pass;
	String url;

	@BeforeMethod
	public void OpenApplication() {
		driver =Browser.launchBrowser();
	}
	
	@Test
	public void verifySwagLabLoginFunctionality() {
		user =Parametrization.getExcelData("Creds", 1, 1);
		pass =Parametrization.getExcelData("Creds", 2, 1);
		loginSwagLab(driver, user, pass);
		url =driver.getCurrentUrl();
		Assert.assertTrue(url.contains("inventory.html"));
	}
	
	
}
