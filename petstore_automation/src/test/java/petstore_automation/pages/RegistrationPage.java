package petstore_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By userIdField = By.name("username");
    By newPasswordField = By.name("password");
    By repeatPasswordField = By.name("repeatedPassword");

    public void enterUserId(String id){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userIdField)).sendKeys(id);
    }
    public void enterNewPassword(String newPassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newPasswordField)).sendKeys(newPassword);
    }
    public void enterRepeatedPassword(String repeatedPassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(repeatPasswordField)).sendKeys(repeatedPassword);
    }
}
