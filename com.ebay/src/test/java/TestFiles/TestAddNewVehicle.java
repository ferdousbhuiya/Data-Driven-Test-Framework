package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MyGaragePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class TestAddNewVehicle extends BasePage {
    @Test
    public void addNewVehicle(){
        HomePage homePage = new HomePage();
        homePage.addVehicle().addVehicle().addNewVehicle();
        waitForVisibilityOfElement(MyGaragePage.vehicleImage);
        assertTrue(MyGaragePage.vehicleImage.isDisplayed());

    }

}
