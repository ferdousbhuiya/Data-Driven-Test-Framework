package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchStoresLocationResultPage extends BasePage {

    @FindBy(id = "slMap")
    public static WebElement mapResult;

    public SearchStoresLocationResultPage(){
        PageFactory.initElements(driver,this);
    }

}
