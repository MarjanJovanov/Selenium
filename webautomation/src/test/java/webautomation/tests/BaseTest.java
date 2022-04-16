package webautomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webautomation.framework.Browser;
import webautomation.pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String brs = "chrome";
    public static final String URL = "http://138.201.197.35:81/magento1/";
    public HomePage homePage;
    public AccountCreatePage accountCreatePage;
    public ToysPage toysPage;
    public FoodProductsPage foodProductsPage;
    public ShoppingCard shoppingCard;
    public CheckoutShippingPage checkoutShippingPage;
    public MoviesPage moviesPage;


    Browser browser = new Browser();


    @BeforeMethod
    public void set_up() {

        driver = browser.open(this.brs);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);

        //pages
        homePage = new HomePage(driver, wait);
        accountCreatePage = new AccountCreatePage(driver, wait);
        toysPage = new ToysPage(driver, wait);
        foodProductsPage = new FoodProductsPage(driver, wait);
        shoppingCard = new ShoppingCard(driver, wait);
        checkoutShippingPage = new CheckoutShippingPage(driver,wait);
        moviesPage = new MoviesPage(driver,wait);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
    }


    @AfterMethod
    public void tear_down() {
        driver.quit();
    }
}
