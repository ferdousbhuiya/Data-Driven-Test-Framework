package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProtectionPage extends BasePage {

    @FindBy(xpath = "//div[@data-testid='BtnContainer']//button")
    public WebElement noThanksButton;

    public ProtectionPage(){
        PageFactory.initElements(driver,this);
    }
    public ExpressCartPage chooseProtection(){
        waitForVisibilityOfElement(noThanksButton);
        clickOnElement(noThanksButton);
        return new ExpressCartPage();
    }

}
