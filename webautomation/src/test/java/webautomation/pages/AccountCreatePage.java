package webautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreatePage {

    WebDriver driver;
    WebDriverWait wait;


    public AccountCreatePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By nameField = By.xpath("//*[@id=\"firstname\"]");
    By lastNameField = By.xpath("//*[@id=\"lastname\"]");
    By eMailField = By.xpath("//*[@id=\"email_address\"]");
    By passwordField = By.xpath("//*[@id=\"password\"]");
    By confirmPasswordField = By.xpath("//*[@id=\"password-confirmation\"]");
    By createAnAccountButton = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
    By message = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");



    public void setFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys(lastName);
    }

    public void setEMail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(eMailField)).sendKeys(email);
    }

    public void setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public void confirmPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordField)).sendKeys(pass);
    }

    public void submitCreateAccount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccountButton)).click();
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(message)).getText();
    }

    public String actualMessage() {
        return "Thank you for registering with Main Website Store.";
    }


}
