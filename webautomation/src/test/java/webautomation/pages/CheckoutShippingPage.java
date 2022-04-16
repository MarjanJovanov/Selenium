package webautomation.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutShippingPage {

    WebDriver driver;
    WebDriverWait wait;


    public CheckoutShippingPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By addressField = By.xpath("//*[contains(@class, 'form form-shipping-address')]//fieldset/div/div/div/input");
    By cityField = By.xpath("//*[contains(@class, 'form form-shipping-address')]//div[4]/div/input");
    By zipCodeField = By.xpath("//*[contains(@class, 'form form-shipping-address')]//div[7]/div/input");
    By countryField = By.xpath("//*[contains(@class, 'form form-shipping-address')]//div[8]/div/select");
    By phoneField = By.xpath("//*[contains(@class, 'form form-shipping-address')]//div[9]/div/input");
    By nextField = By.xpath("//*[contains(@class,'checkout-shipping-method')]/div[3]/form/div[3]/div/button/span");
    By getPlaceOrder = By.xpath("//*[contains(@class,'payment-method _active')]/div[2]/div[4]/div");
    By purchaseMessage= By.xpath("/html/body/div[1]/main/div[1]/h1/span");


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void setAddress(String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressField)).sendKeys(address);
    }

    public void setCity(String city){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).sendKeys(city);
    }

    public void setZipCode(String zip){
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeField)).sendKeys(zip);
    }


    public void setCountry(String country){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryField)).sendKeys(country);
        sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryField)).sendKeys(Keys.ENTER);
    }

    public void setPhoneNumber(String phone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneField)).sendKeys(phone);
    }


    public void clickNext(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextField)).click();
    }


    public void getFocusOnPlaceOrder(){
        WebElement element = driver.findElement(getPlaceOrder);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }
    public void clickPlaceOrder(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getPlaceOrder)).click();
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseMessage)).getText();
    }

    public String actualMessage(){
        return "Thank you for your purchase!";
    }
}
