package webautomation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

           // new user registration
    @Test
    public void firstTest() {


        homePage.createAccount();
        accountCreatePage.setFirstName("Nick");
        accountCreatePage.setLastName("Johnson");
        accountCreatePage.setEMail("nikjohnson12345@yahoo.com");
        accountCreatePage.setPassword("1@3AsE4^$&229!@3");
        accountCreatePage.confirmPassword("1@3AsE4^$&229!@3");
        accountCreatePage.submitCreateAccount();
        Assert.assertEquals(accountCreatePage.getMessage(), accountCreatePage.actualMessage());

    }


        // adding 3 products to the shopping card


        // first product
    @Test
    public void secondTest() {

        toysPage.goToToys();
        driver.navigate().refresh();
        toysPage.pawPatrolAdd();
        Assert.assertEquals(toysPage.getMessage(), toysPage.actualMessage());
    }

        // second product
    @Test
    public void thirdTest() {

        moviesPage.goToMovies();
        driver.navigate().refresh();
        moviesPage.tretoFilmche();
        moviesPage.sleep(5000);
        Assert.assertEquals(moviesPage.getMessage(), moviesPage.actualMessage());
    }

        // third Product
    @Test
    public void fourthTest() {

        foodProductsPage.goToFoodProducts();
        driver.navigate().refresh();
        foodProductsPage.bonOd1000DenariAdd();
        Assert.assertEquals(foodProductsPage.getMessage(), foodProductsPage.actualMessage());

    }

        // deleting product from the shopping card
    @Test
    public void fifthTest() {

        shoppingCard.goToShoppingCard();
        shoppingCard.deleteProduct();
        shoppingCard.sleep(3000);
        shoppingCard.clickOkButton();
        shoppingCard.clickCheckOut();

    }

        // Checkout
    @Test
    public void sixthTest() {

        checkoutShippingPage.setAddress("Some street no.34");
        checkoutShippingPage.setCity("Skopje");
        checkoutShippingPage.setZipCode("1000");
        checkoutShippingPage.setCountry("Macedonia");
        checkoutShippingPage.setPhoneNumber("078789456");
        checkoutShippingPage.clickNext();
        checkoutShippingPage.getFocusOnPlaceOrder();
        checkoutShippingPage.sleep(3000);
        checkoutShippingPage.clickPlaceOrder();
        Assert.assertEquals(checkoutShippingPage.getMessage(), checkoutShippingPage.actualMessage());

    }
}
