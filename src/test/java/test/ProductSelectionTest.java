package test;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class ProductSelectionTest extends BaseClass{
	@Test
	public void ProductSelectTest()	{
		LoginPage objlogin = new LoginPage();		
		objlogin.Login("standard_user", "secret_sauce");
		
		ProductPage objProductPage= new ProductPage();
		objProductPage.AddToCart("Sauce Labs Backpack");
		
	}

}
