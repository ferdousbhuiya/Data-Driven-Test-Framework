package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedItemPage extends BasePage {

    @FindBy(id = "search_box_one_search_input")
    public static WebElement searchedItem;
    public SearchedItemPage(){
        PageFactory.initElements(driver,this);
    }
}
