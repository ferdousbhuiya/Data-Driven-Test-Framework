package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestDeleteDocument extends BasePage {
    @Test
    public void testDeleteDocument() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().deleteDocument();
        waitForVisibilityOfElement(UserAccountPage.fileWrapper);
        assertTrue(UserAccountPage.fileWrapper.isDisplayed());


    }

}
