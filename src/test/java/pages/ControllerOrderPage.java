package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControllerOrderPage extends BasePage {

    String controllerOrderURL = "http://automationpractice.com/index.php?controller=order";

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement alertWarningText;

    @FindBy(xpath = "//td[@data-title='Total']/span[@class='price']")
    private WebElement totalPriceText;

    @FindBy(id = "cart_quantity_up_1_1_0_0")
    private WebElement addButton;

    public ControllerOrderPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public String controllerOrderPageIsLoaded() {
        return webDriver.getCurrentUrl();
    }

    public String controllerOrderPageURL() {
        return controllerOrderURL;
    }

    public void clickDeleteButton() {
        deleteButton.click();
        sleep(2000);
    }

    public boolean productIsLoaded() {
        return deleteButton.isDisplayed();
    }

    public String alertWarningTextIsLoaded() {
        return alertWarningText.getText();
    }

    public void clickOnAddButton() {
        addButton.click();
        sleep(3000);
    }

    public String totalPriceTextIsLoaded() {
        return totalPriceText.getText();
    }
}
