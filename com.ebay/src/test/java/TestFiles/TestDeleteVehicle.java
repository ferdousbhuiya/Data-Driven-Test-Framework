package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MyGaragePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

public class TestDeleteVehicle extends BasePage {
    @Test
    public void testDelete(){
        HomePage homePage = new HomePage();
        homePage.addVehicle().addVehicle().deleteVehicle();
        waitForVisibilityOfElement(MyGaragePage.whatDoYouDriveText);
        assertFalse(isElementVisible(MyGaragePage.vehicleImage));
    }
}
