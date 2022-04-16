package webautomation.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    WebDriver driver;


    public WebDriver open(String browser) {


        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/driver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser unknown!");
        }
        return driver;
    }
}
