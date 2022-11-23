package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FranchiseConfirmationPage extends BasePage {
    @FindBy(xpath = "//div[@class='result_container']")
    public static WebElement confirmationResult;
    public FranchiseConfirmationPage(){
        PageFactory.initElements(driver,this);
    }

}
