package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChargingPage extends BasePage {
    @FindBy(xpath = "//div[@class='reveal-wrap']/div[1]/div")
    public List<WebElement> productsList;

    public ChargingPage() {
        PageFactory.initElements(driver, this);
    }

    public ItemsPage selectCharger() {
        waitForVisibilityOfElement(productsList.get(1));
        moveToElementAndClick(productsList.get(1).findElement(By.tagName("a")));
        return new ItemsPage();
    }
}
