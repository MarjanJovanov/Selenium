package petstore_automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import petstore_automation.framework.Browser;
import petstore_automation.pages.HomePage;
import petstore_automation.pages.RegistrationPage;
import petstore_automation.pages.SignInPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String brs = "chrome";
    public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action;jsessionid=AD26A68544E0955E48CD9C23DEC752DD";
    public HomePage homePage;
    public SignInPage signInPage;
    public RegistrationPage registrationPage;


    Browser browser = new Browser();

    @BeforeMethod
    public void set_up() {

        driver = browser.open(this.brs);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);

        homePage = new HomePage(driver, wait);
        signInPage = new SignInPage(driver,wait);
        registrationPage = new RegistrationPage(driver,wait);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
    }


    @AfterMethod
    public void tear_down() {
        driver.quit();
    }
}
