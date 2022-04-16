package webautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;


    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By createAnAccountField = By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");



    public void createAccount(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccountField)).click();
    }



}
