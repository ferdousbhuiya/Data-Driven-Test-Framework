package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.IxSportAcitivityVehiclePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestNavigateToTheBuildingPage extends BasePage {

    @Test
    public void testGetTheBuildPage(){
        HomePage homePage =new HomePage();
        homePage.clickBuildYourOwnLink().clickSelect();
        waitForVisibilityOfElement(IxSportAcitivityVehiclePage.customizeThisBuildButton);
        assertTrue(IxSportAcitivityVehiclePage.customizeThisBuildButton.isDisplayed());
    }
}
