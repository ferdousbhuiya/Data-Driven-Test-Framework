package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffordableConnectivityPage extends BasePage {
    @FindBy(xpath = "//div[@class='info fadein-custom animated']//a[contains(text(),'Check availability')]")
    public WebElement checkAvailability;
    @FindBy(id = "targetedOffer")
    public static WebElement header;

    public AffordableConnectivityPage(){
        PageFactory.initElements(driver,this);
    }

    public void checkAvailability(){
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='info fadein-custom animated']//a[contains(text(),'Check availability')]")));
        waitForVisibilityOfElement(checkAvailability);
        moveToElementAndClick(checkAvailability);
        waitForVisibilityOfElement(checkAvailability);
        retryingFindClick(By.xpath("//div[@class='info fadein-custom animated']//a[contains(text(),'Check availability')]"));
//      jsMoveToElementAndClick(checkAvailability);

    }
}
