package TestFiles;


import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSignIn extends BasePage {
    @Test
    public void testSignIn() throws SQLException {

        HomePage homePage =new HomePage();
        homePage.signIn().fillOutSignInForm();
        assertTrue(isElementVisible(UserAccountPage.signOutButton));
    }

}
