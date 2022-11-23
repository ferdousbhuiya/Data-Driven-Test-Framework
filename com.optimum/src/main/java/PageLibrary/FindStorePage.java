package PageLibrary;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindStorePage extends BasePage {
    @FindBy(xpath = "//ol[@class='ResultList js-resultlist']/li")
    public List<WebElement>listOfStores;



    @FindBy(xpath = "//div[@class='Locator-content'")
    public WebElement locatorMAp;

    public FindStorePage(){
        PageFactory.initElements(driver,this);
    }

    public StorePage selectStore(){
//        waitForVisibilityOfElement(locatorMAp);
        waitForVisibilityOfElement(listOfStores.get(1).findElement(By.tagName("a")));
        scrollDown(listOfStores.get(1).findElement(By.tagName("a")));
        jsClickOnElement(listOfStores.get(1).findElement(By.tagName("a")));
        return new StorePage();
    }

}