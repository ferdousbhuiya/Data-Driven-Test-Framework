package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanPage extends BasePage {
    @FindBy(xpath = "//div[@class='sc-jNJNQp kIKDNA']")
    public static WebElement allPlan;

    @FindBy(xpath = "//div[@class='sc-dEVLtI ccWpti']/div[3]//div[@class='sc-kImNAt klKWJx']//div[@class='select-button-desktop']//button")
    public static WebElement selectPlanButton;
    public PlanPage(){
        PageFactory.initElements(driver,this);
    }

    public ProtectionPage navigateToProtectionPage(){
        clickOnElement(selectPlanButton);
        return new ProtectionPage();
    }
}
