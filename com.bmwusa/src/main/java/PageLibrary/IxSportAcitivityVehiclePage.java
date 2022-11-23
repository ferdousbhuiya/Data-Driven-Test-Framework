package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IxSportAcitivityVehiclePage extends BasePage {

    @FindBy(xpath = "//div[@class='selected-vehicle-cta cta-2']/a")
    public static WebElement customizeThisBuildButton;

    public IxSportAcitivityVehiclePage() {
        PageFactory.initElements(driver, this);
    }

    public CustomizePage clickCustomizeThisBuild(){
        waitForVisibilityOfElement(customizeThisBuildButton);
        clickOnElement(customizeThisBuildButton);
        return  new CustomizePage();
    }
}
