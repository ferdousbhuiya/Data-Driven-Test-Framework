package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MyAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestNavigationToMyAccount extends BasePage {


    @Test
    public void testNavigationToMyAccount() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.signInUsingExistentAccount().navigateToMyAccount();
        waitForVisibilityOfElement(MyAccountPage.iframe);
        switchToFrameByElement(MyAccountPage.iframe);
        waitForVisibilityOfElement(MyAccountPage.myAccountHeader);
        assertTrue(MyAccountPage.myAccountHeader.isDisplayed());

    }
}
