package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddDocument extends BasePage {

    @Test
    public void testAddingDocument() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().addDocument();
        waitForVisibilityOfElement(UserAccountPage.fileWrapper);
        assertTrue(UserAccountPage.fileWrapper.isDisplayed());

    }
}
