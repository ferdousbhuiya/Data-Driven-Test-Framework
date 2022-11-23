package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {


    @FindBy(id = "cdk-overlay-0")
    public static WebElement myAccountHeader;

    @FindBy(xpath = "//div[@id='AccountSettings']/iframe")
    public static WebElement iframe;
    public MyAccountPage()
    {
        PageFactory.initElements(driver, this);
    }
}
