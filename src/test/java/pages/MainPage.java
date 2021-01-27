package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    String mainPageURL = "http://automationpractice.com/index.php";

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInButton;

    @FindBy(xpath = "//ul[1]/li[1]/div/div/div/a[@title='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    public MainPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public void openMainPage() {
        webDriver.get(mainPageURL);
    }

    public String mainPageIsLoaded() {
        return webDriver.getCurrentUrl();
    }

    public String mainPageURL() {
        return mainPageURL;
    }

    public SignInPage clickOnSignInButton() {
        signInButton.click();
        return new SignInPage(webDriver);
    }

    public void clickOnAddToCartButton() {
        scrollDown();
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", addToCartButton);
    }

    public ControllerOrderPage clickOnProceedToCartButton() {
        waitUntilElementIsAppear(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        return new ControllerOrderPage(webDriver);
    }
}
