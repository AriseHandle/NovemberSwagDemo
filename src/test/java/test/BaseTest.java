package test;

import org.openqa.selenium.WebDriver;

import pom.SwagLabLoginPage;

public class BaseTest {
	SwagLabLoginPage swagLabLoginPage;
	public static WebDriver driver;
	String user;
	String pass;
	
	public BaseTest loginSwagLab(WebDriver driver, String user, String pass) {
		swagLabLoginPage = new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUserName(user);
		swagLabLoginPage.enterPassword(pass);
		swagLabLoginPage.clickLoginButton();
		return this;
	}

}
