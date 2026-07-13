package tests;

import org.testng.annotations.Test;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.DriverFactory;
import com.saucedemo.pages.ProductsPage; 
import org.testng.Assert; 
public class LoginTest {
    @Test 
    public void openBrowser() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.openWebSite();
        loginPage.login("standard_user","secret_sauce"); 

        ProductsPage productsPage = new ProductsPage();
        productsPage.addBackpackToCart();
        productsPage.openCart();

    Assert.assertEquals(productsPage.getProductName(), "Sauce Labs Backpack");

    productsPage.clickCheckout();
    productsPage.enterCustomerDetails("John", "Doe", "600001"); 
    productsPage.clickContinue();
    productsPage.clickFinish();
    Assert.assertEquals(productsPage.getSuccessMessage(), "Thank you for your order!");

    Thread.sleep(5000); 
    DriverFactory.quitDriver();

    }
}
