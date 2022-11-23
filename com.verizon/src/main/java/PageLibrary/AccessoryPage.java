package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoryPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'has been added to cart.')]")
    public static WebElement addedToCartText;

    @FindBy(xpath = "//div[@class='sc-gJqSRm dXBASI']/button")
    public WebElement continueButtonToChoosePlan;


    public AccessoryPage(){
        PageFactory.initElements(driver,this);
    }

    public ExpressCartPage navigateToExpressCart(){
        waitForVisibilityOfElement(continueButtonToChoosePlan);
        clickOnElement(continueButtonToChoosePlan);
        return new ExpressCartPage();
    }
}
