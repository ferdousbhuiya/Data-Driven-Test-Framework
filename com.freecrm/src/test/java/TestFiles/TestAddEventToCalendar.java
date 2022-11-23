package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class TestAddEventToCalendar extends BasePage {

    @Test
    public void testAddingEventToCalendar() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().addEventToCalendar();
        waitForVisibilityOfElement(UserAccountPage.eventName);
        assertTrue(UserAccountPage.eventName.isDisplayed());

    }
}
