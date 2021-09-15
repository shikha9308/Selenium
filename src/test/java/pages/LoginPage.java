package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import test.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	
	//============================ WebElements ==========================================
	
	@FindBy(id="user-name")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login-button")
	WebElement LoginButton;
	
	@FindBy(className="title")
	WebElement Title;
	
	@FindBy(xpath="//h3")
	WebElement Error;
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//============================= Methods ==========================================4
	
	
	public void Login(String UserNameVal , String PasswordVal) {
		
		//WebElement UserName = driver.findElement(By.id("user-name"));
		//WebElement Password = driver.findElement(By.id("password"));
		//WebElement LoginButton = driver.findElement(By.id("login-button"));
		
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		LoginButton.click();
		
	}
	
	public void ValidateLoginSuccess() {
		
		//WebElement Title = driver.findElement(By.className("title"));
		
		Assert.assertTrue(Title.isDisplayed());
		Assert.assertEquals(Title.getText(), "PRODUCTS");
	}
	
	public void ValidateLoginFailiure() {
		
		//WebElement Error = driver.findElement(By.xpath("//h3"));
		
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(Error.getText(), "Epic sadface: Username and password do not match any user in this service");
	}

}
