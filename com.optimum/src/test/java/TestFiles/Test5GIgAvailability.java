package TestFiles;

import PageLibrary.CheckAvailabilityPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Test5GIgAvailability extends BasePage {
    @Test
    public void test5GiAvailability(){
        HomePage homePage= new HomePage();
        homePage.check5GiAvailability().clickCheckAvailabilityButton();
        waitForVisibilityOfElement(CheckAvailabilityPage.specialOfferHeader);
        assertTrue(CheckAvailabilityPage.specialOfferHeader.isDisplayed());
    }


}
