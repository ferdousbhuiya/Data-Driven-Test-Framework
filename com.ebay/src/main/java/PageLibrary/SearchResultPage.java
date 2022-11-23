package PageLibrary;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//ul[@class='srp-results srp-list clearfix']/li")
    public List<WebElement> allItemsResults;

    @FindBy(xpath = "//div[@class='srp-river srp-layout-inner']")
    public static WebElement results;


    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }

    public ItemPage selectItem(){
        waitForVisibilityOfElement(allItemsResults.get(2));
        moveToElementAndClick(allItemsResults.get(2).findElement(By.tagName("a")));
        switchToTab();
        return  new ItemPage();
    }
}
