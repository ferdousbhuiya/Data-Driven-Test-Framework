package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestNavigateToCreateAccount extends BasePage {
    @Test
    public void testSignUp() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToCreateAnAccount();
        waitForVisibilityOfElement(HomePage.createAccountText);
        assertTrue(HomePage.createAccountText.isDisplayed());
    }
}
