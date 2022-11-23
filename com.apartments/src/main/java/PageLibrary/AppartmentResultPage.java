package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppartmentResultPage extends BasePage {

    @FindBy(xpath = "//label[contains(text(),'Renter View')]")
    public static WebElement renterViewText;


    public AppartmentResultPage(){
        PageFactory.initElements(driver,this);
    }
}
