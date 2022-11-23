package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonePage extends BasePage {

    @FindBy(xpath = "//div[@class='leftContainer']/div/div[3]//button")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@data-testid='newCustomerCta']")
    public WebElement newCustomerButton;

    @FindBy(xpath = "//button[@data-testid='zipConfirm']")
    public WebElement confirmLocation;

    public PhonePage() {
        PageFactory.initElements(driver, this);
    }

    public AccessoryPage addPhoneToCart() {
        waitForVisibilityOfElement(continueButton);
        moveToElementAndClick(continueButton);
        clickOnElement(newCustomerButton);
        clickOnElement(confirmLocation);
        return new AccessoryPage();
    }

}
