package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseClass;

public class ProductPage {
	
	WebDriver driver = BaseClass.driver;
	
	//id="add-to-cart-sauce-labs-backpack"
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddtoCart;
	
	public ProductPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void AddToCart(String ProductName) {
		
		//AddtoCart.click();
		WebElement product =driver.findElement(By.xpath("//div[text()='" + ProductName + "']//following::button[1]"));
		product.click();
			
		
	}
}
