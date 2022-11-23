package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MyGaragePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;



public class TestAddVehicle extends BasePage {
    @Test
    public void testAddVehicle(){
        HomePage homePage = new HomePage();
        homePage.addVehicle().addVehicle();
        waitForVisibilityOfElement(MyGaragePage.vehicleImage);
        assertTrue(MyGaragePage.vehicleImage.isDisplayed());
    }
}
