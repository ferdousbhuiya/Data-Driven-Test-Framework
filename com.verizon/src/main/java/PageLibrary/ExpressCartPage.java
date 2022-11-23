package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpressCartPage extends BasePage {
    @FindBy(xpath = "//button[.//span[text()='Continue']]")
    public WebElement continueButton;

    @FindBy(xpath = "//h1[contains(text(),\"Let's build your order.\")]")
    public WebElement letBuildText;

    @FindBy(xpath = "//a[1][.//span[text()='Remove']]")
    public WebElement removeButton;
    @FindBy(xpath = "//button[.//span[text()='Remove item']]")
    public WebElement confirmRemoveButton;

    @FindBy(xpath = "//div[@data-testid='expressCheckoutContent']//h1")
    public static WebElement whatInYourCartText;

    @FindBy(id = "page")
    public static WebElement yourCartIsEmptyText;

    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    public static WebElement shoppingCartItems;

    public ExpressCartPage() {
        PageFactory.initElements(driver, this);
    }

    public PlanPage navigateToChoosePlan() {
        waitForVisibilityOfElement(letBuildText);
        clickOnElement(continueButton);
        return new PlanPage();
    }

    public ExpressCartPage removeItemFromCart() {
        waitForVisibilityOfElement(removeButton);
        clickOnElement(removeButton);
        waitForVisibilityOfElement(confirmRemoveButton);
        clickOnElement(confirmRemoveButton);
        return new ExpressCartPage();
    }

}
