package webautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToysPage {

    WebDriver driver;
    WebDriverWait wait;


    public ToysPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By toys = By.xpath("//*[@id=\"ui-id-5\"]/span");
    By pawPatrol = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[2]/div/div[1]/form/button/span");
    By message = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToToys() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(toys)).click();
    }

    public void pawPatrolAdd() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pawPatrol)).click();
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(message)).getText();
    }

    public String actualMessage() {
        return "You added Paw Patrol to your shopping cart.";
    }

}
