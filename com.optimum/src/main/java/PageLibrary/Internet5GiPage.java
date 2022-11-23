package PageLibrary;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Internet5GiPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Check availability ')]")
    public WebElement checkAvailabilityButton;

    public Internet5GiPage() {
        PageFactory.initElements(driver, this);
    }

    public CheckAvailabilityPage clickCheckAvailabilityButton() {
        retryingFindClick(By.xpath("//a[contains(text(),'Check availability ')]"));
        return new CheckAvailabilityPage();
    }
}
