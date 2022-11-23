package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestDeleteContat extends BasePage {

    @Test
    public void testDeleteContact() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().deleteContact();
        waitForVisibilityOfElement(UserAccountPage.displayedContactName);
        assertTrue(UserAccountPage.displayedContactName.isDisplayed());
    }
}
