package BaseClass;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.testng.annotations.*;

public class BaseClass {

	public String WebDriver ;
	@BeforeClass
	public  void setUp() {

System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
 new EdgeDriver();

	}
	
	public void tearDown() {
		
		
	}

}
