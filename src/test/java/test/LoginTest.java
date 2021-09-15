package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test(groups= {"Regression"})
	public void LoginSuccess() {
		
		LoginPage objlogin = new LoginPage();
		
		objlogin.Login("standard_user", "secret_sauce");
		objlogin.ValidateLoginSuccess();
		
	}
	
	@Test(groups= {"Regression"})
	public void LoginFailiure() {
		
		LoginPage objlogin = new LoginPage();
		
		objlogin.Login("standard_user", "secret_sauce1");
		objlogin.ValidateLoginFailiure();	
		
	}
	
	//*[@id="shopping_cart_container"]/a

}
