package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MyGaragePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestChangeVehicle extends BasePage {

    @Test
    public void testChangeVehicle(){
        HomePage homePage = new HomePage();
        homePage.addVehicle().addVehicle().addNewVehicle().changeVehicle();
        waitForVisibilityOfElement(MyGaragePage.vehicleImage);
        assertTrue(MyGaragePage.vehicleImage.isDisplayed());
    }
}
