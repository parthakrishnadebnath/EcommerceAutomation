package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;
import PageObject.HomePage;

public class TC001_MobileAddToCart extends BaseClass {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	HomePage hp= new HomePage(driver);
	hp.openUrl();
	hp.search();
	hp.sorting();
	hp.addToCart();
	
	}
	
	
}
