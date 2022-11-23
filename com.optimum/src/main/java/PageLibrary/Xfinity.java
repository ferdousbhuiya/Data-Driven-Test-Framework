package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Xfinity extends BasePage {
    @FindBy(xpath = "//header[@class='x-page__header']")
    public static WebElement headerText;
    public Xfinity(){
        PageFactory.initElements(driver,this);
    }
}
