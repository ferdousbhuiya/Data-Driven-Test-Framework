package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrandJeansPage extends BasePage {

    @FindBy(xpath = "//div[@class='pagecontainer__top']//h1")
    public static WebElement branJeansName;

    @FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']/li")
    public List<WebElement> listOfAllJeans;
    public BrandJeansPage(){
        PageFactory.initElements(driver,this);
    }


    public ItemPage selectJeans(){
        waitForVisibilityOfElement(listOfAllJeans.get(2));
        clickOnElement(listOfAllJeans.get(2));
        switchToTab();
        return new ItemPage();
    }
}