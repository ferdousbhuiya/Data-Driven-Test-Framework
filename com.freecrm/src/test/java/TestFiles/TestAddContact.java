package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddContact extends BasePage {

    @Test
    public void testAddContact() throws SQLException, InterruptedException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().addContact().fillOutContactInformation();
        waitForVisibilityOfElement(UserAccountPage.contactName);
        assertTrue(UserAccountPage.contactName.isDisplayed());


    }
}
