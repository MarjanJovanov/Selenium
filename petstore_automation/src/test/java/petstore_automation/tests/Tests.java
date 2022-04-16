package petstore_automation.tests;

import org.testng.annotations.Test;
import petstore_automation.pages.HomePage;
import petstore_automation.pages.SignInPage;

public class Tests extends BaseTest {

    @Test
    public void first() {
        homePage.createAccount();
        signInPage.registerUser();
        registrationPage.enterUserId("12345");
        registrationPage.enterNewPassword("@hSj@k@");
        registrationPage.enterRepeatedPassword("@hSj@k@");
    }
}
