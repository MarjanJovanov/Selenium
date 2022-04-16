package webautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCard {

    WebDriver driver;
    WebDriverWait wait;


    public ShoppingCard(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By shoppingCard = By.xpath("/html/body/div[1]/header/div[2]/div[1]/a");
    By bin = By.xpath("//*[@id=\"mini-cart\"]/li[3]/div/div/div[2]/div[2]/a");
    By checkout = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");
    By clickOk = By.xpath("/html/body/div[2]/aside[2]/div[2]/footer/button[2]/span");
    //By proceedMessage= By.xpath("//*[@id='\"'top-cart-btn-checkout\"]");

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToShoppingCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCard)).click();
    }

    public void deleteProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bin)).click();
    }

    public void clickOkButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOk)).click();
    }

    public void clickCheckOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout)).click();
    }

}
