package webautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodProductsPage {

    WebDriver driver;
    WebDriverWait wait;


    public FoodProductsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }



    By foodProducts = By.xpath("//*[@id=\"ui-id-11\"]/span");
    By bon = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[3]/ol/li[2]/div/div/div[2]/div/div[1]/form/button/span");
    By message = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");





    public void goToFoodProducts(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(foodProducts)).click();
    }
    public void bonOd1000DenariAdd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(bon)).click();
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(message)).getText();
    }

    public String actualMessage(){
        return "You added Bon od 1000 denari to your shopping cart.";
    }

}
