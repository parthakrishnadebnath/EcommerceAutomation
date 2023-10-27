package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    // Constructor to initialize the WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBox;
    
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement search;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    WebElement sortBy;

    @FindBy(xpath = "//div[@id='reviewsRefinements']//li[@id='p_72/1318476031']//span[@class='a-size-small a-color-base'][normalize-space()='& Up']")
    WebElement customerReview;

    @FindBy(xpath = "//img[@alt='Spigen Mag Armor Magfit Back Cover Case Compatible with MagSafe Designed for iPhone 14 (TPU + Poly Carbonate | Matte Black)']")
    WebElement mobile;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCart;

    public void openUrl() {
        driver.get("https://amazon.in");
    }

    public void search() {
        searchBox.sendKeys("mobile");
        search.click();
    }

    public void sorting() {
        sortBy.click();
        Select select = new Select(sortBy);
        select.selectByVisibleText("Price: Low to High");
        customerReview.click();
    }

    public void addToCart() {
        addToCart.click(); // Added click action
    }
}
