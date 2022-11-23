package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends BasePage {
    @FindBy(xpath = "//div[@class='url_wrapper']/div[1]//a")
    public WebElement chatAboutMobile;

    @FindBy(id = "textarea")
    public static WebElement chatTextArea;

    @FindBy(id = "askvz_frame")
    public static WebElement iframeChat ;
    public SupportPage(){
        PageFactory.initElements(driver,this);
    }
    public void chatAboutMobile(){
        clickOnElement(chatAboutMobile);
    }

}
