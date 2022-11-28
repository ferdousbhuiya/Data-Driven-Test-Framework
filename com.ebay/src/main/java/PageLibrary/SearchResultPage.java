package PageLibrary;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {


    //Old one =
    @FindBy(xpath = "(//div[@class='s-item__wrapper clearfix'])")
    public List<WebElement> allItemsResults;

    @FindBy(xpath = "//div[@class='srp-river srp-layout-inner']")
    public static WebElement results;


    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }

    public ItemPage selectItem(){
        waitForVisibilityOfElement(allItemsResults.get(3));
        moveToElementAndClick(allItemsResults.get(3));
        switchToTab();
        return  new ItemPage();
    }
}
