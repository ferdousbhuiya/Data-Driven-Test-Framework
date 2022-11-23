package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetSmartWifi6PAge extends BasePage {


    @FindBy(xpath = "//a[contains(text(),'Start shopping')]")
    public WebElement checkAvailabilityButton;


    public InternetSmartWifi6PAge(){
        PageFactory.initElements(driver,this);
    }
    public CheckAvailabilityPage shoppSmartWifi() {
        waitForVisibilityOfElement(checkAvailabilityButton);
        jsClickOnElement(checkAvailabilityButton);
        return  new CheckAvailabilityPage();

    }


}
