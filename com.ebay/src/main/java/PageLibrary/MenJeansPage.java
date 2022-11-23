package PageLibrary;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenJeansPage extends BasePage {
    @FindBy(xpath = "//div[@id='mainContent']/section[2]/div[2]/div/div/ul/li")
    public List<WebElement> shopTopBrand;

    public MenJeansPage() {
        PageFactory.initElements(driver, this);
    }

    public BrandJeansPage shopTopBrand() {
        waitForVisibilityOfElement(shopTopBrand.get(0));
        clickOnElement(shopTopBrand.get(0));
        return new BrandJeansPage();
    }
}