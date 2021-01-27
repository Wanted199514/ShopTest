package pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    String myAccountPageURL ="http://automationpractice.com/index.php?controller=my-account";

    public MyAccountPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public String myAccountPageIsLoaded() {
        return webDriver.getCurrentUrl();
    }

    public String myAccountPageURL() {
        return myAccountPageURL;
    }
}
