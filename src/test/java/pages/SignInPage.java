package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    String signInURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public SignInPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public String signInPageIsLoaded() {
        return webDriver.getCurrentUrl();
    }

    public MyAccountPage inputData(String email, String password) {
        emailField.click();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        signInButton.click();
        return new MyAccountPage(webDriver);
    }

    public String signInURL() {
        return signInURL;
    }
}
