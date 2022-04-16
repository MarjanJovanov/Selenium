package webautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoviesPage {



    WebDriver driver;
    WebDriverWait wait;


    public MoviesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }



    By movies = By.xpath("//*[@id=\"ui-id-4\"]/span");
    By tretoFilmch = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[3]/ol/li[3]/div/div/div[2]/div/div[1]/form/button/span");
    By messageFilmche = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void goToMovies() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(movies)).click();
    }

    public void tretoFilmche() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tretoFilmch)).click();
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(messageFilmche)).getText();
    }

    public String actualMessage(){
        return "You added TRETO FILMCHE to your shopping cart.";
    }

}
