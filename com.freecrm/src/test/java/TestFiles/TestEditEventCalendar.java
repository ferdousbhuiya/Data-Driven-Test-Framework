package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestEditEventCalendar extends BasePage {

    @Test
    public void testingEditEventCalendar() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().editEventCalendar();
        waitForVisibilityOfElement(UserAccountPage.eventNameDisplayed);
        assertTrue(UserAccountPage.eventNameDisplayed.isDisplayed());
    }
}


