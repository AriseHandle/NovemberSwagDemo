package test;

import java.util.Iterator;
import java.util.Set;

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
	
	public void switchToWindow(String expectedTitle) {
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterrate =handles.iterator();
		while(iterrate.hasNext())
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String handle =iterrate.next();
			driver.switchTo().window(handle);
			if(driver.getTitle().equals(expectedTitle))
			{
				break;
			}
						
		}
	}

}
