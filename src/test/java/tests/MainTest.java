package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ControllerOrderPage;
import pages.MyAccountPage;
import pages.SignInPage;

public class MainTest extends BaseTest{

    @Test
    public void login() {
        Assert.assertEquals(mainPage.mainPageIsLoaded(),mainPage.mainPageURL(),"Main Page is loaded.");
        SignInPage signInPage = mainPage.clickOnSignInButton();
        Assert.assertEquals(signInPage.signInPageIsLoaded(),signInPage.signInURL(),"Sign In Page is loaded.");
        MyAccountPage myAccountPage = signInPage.inputData("aaa@ggg.com","123456");
        Assert.assertEquals(myAccountPage.myAccountPageIsLoaded(),myAccountPage.myAccountPageURL(),"My Account Page is not loaded.");
    }

    @Test
    public void cartDelete() {
        Assert.assertEquals(mainPage.mainPageIsLoaded(),mainPage.mainPageURL(),"Main Page is loaded.");
        mainPage.clickOnAddToCartButton();
        ControllerOrderPage controllerOrderPage = mainPage.clickOnProceedToCartButton();
        Assert.assertEquals(controllerOrderPage.controllerOrderPageIsLoaded(),controllerOrderPage.controllerOrderPageURL(), "Controller Order Page is not loaded.");
        Assert.assertTrue(controllerOrderPage.productIsLoaded(),"Product is not added.");
        controllerOrderPage.clickDeleteButton();
        Assert.assertEquals(controllerOrderPage.alertWarningTextIsLoaded(),"Your shopping cart is empty.","Product is not deleted.");
    }

    @Test
    public void addProduct() {
        Assert.assertEquals(mainPage.mainPageIsLoaded(),mainPage.mainPageURL(),"Main Page is loaded.");
        mainPage.clickOnAddToCartButton();
        ControllerOrderPage controllerOrderPage = mainPage.clickOnProceedToCartButton();
        Assert.assertEquals(controllerOrderPage.controllerOrderPageIsLoaded(),controllerOrderPage.controllerOrderPageURL(), "Controller Order Page is not loaded.");
        Assert.assertTrue(controllerOrderPage.productIsLoaded(),"Product is not added.");
        controllerOrderPage.clickOnAddButton();
        Assert.assertEquals(controllerOrderPage.totalPriceTextIsLoaded(),"$33.02","Total price is not correct.");
    }
}
