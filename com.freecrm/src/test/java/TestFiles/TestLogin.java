package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestLogin extends BasePage {

    @Test
    public void testingSignUp() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login();
        waitForVisibilityOfElement(UserAccountPage.userNameIsDisplayed);
        assertTrue(UserAccountPage.userNameIsDisplayed.isDisplayed());
    }
}
