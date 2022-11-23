package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SignInPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSignOut extends BasePage {

    @Test
    public void testSignOut() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.signIn().fillOutSignInForm().signOut();
        assertTrue(isElementVisible(SignInPage.signInText));
    }
}
