package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestDragAndDrop extends BasePage {

    @Test
    public void testDragAndDrop() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().dragAndDropElement();
        waitForVisibilityOfElement(UserAccountPage.callQueEmpty);
        assertTrue(UserAccountPage.callQueEmpty.isDisplayed());

    }
}
