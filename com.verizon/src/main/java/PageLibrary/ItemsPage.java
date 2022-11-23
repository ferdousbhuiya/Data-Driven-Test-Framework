package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://www.verizon.com/smartphones/samsung-galaxy-s22-ultra/']")
    public WebElement phone;

    @FindBy(xpath = "//button[.//span[text()='Continue']]")
    public WebElement continueButton;


    public ItemsPage() {
        PageFactory.initElements(driver, this);
    }


    public PhonePage selectPhone() {
        waitForVisibilityOfElement(phone);
        clickOnElement(phone);
        return new PhonePage();
    }

    public ExpressCartPage addChargerToCart() {
        jsClickOnElement(continueButton);
        return new ExpressCartPage();

    }
}
