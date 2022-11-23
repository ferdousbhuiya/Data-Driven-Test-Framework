package PageLibrary;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingAndAccessoriesPage extends BasePage {
    @FindBy(xpath = "//div[@id='mainContent']/section[3]/div[2]/a[4]")
    public WebElement jeans;

    public ClothingAndAccessoriesPage() {
        PageFactory.initElements(driver, this);
    }

    public MenJeansPage navigateToJeansPage() {
        waitForVisibilityOfElement(jeans);
        clickOnElement(jeans);
        return new MenJeansPage();
    }
}