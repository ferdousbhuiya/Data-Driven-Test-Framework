package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestEditContact extends BasePage {

    @Test
    public void testEditContactInfo() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().editContact();
        waitForVisibilityOfElement(UserAccountPage.contactName);
        assertTrue(UserAccountPage.contactName.isDisplayed());

    }
}
