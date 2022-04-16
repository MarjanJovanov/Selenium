package petstore_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {


    WebDriver driver;
    WebDriverWait wait;


    public SignInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By userNameField = By.name("username");
    By password = By.name("password");
    By loginButton = By.name("signon");
    By registerNow = By.xpath("//div[@id='Catalog']/a");




    public void registerUser() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerNow)).click();
    }

}
