package TestFiles;

import PageLibrary.AddPropertyPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestNavigateToAddProperty extends BasePage {

    @Test
    public void testAddProperty() throws SQLException {

        HomePage homePage = new HomePage();
        homePage.signInUsingExistentAccount();
        homePage.navigateToPropertyPage().fillOutAddPropertyForm();
        waitForVisibilityOfElement(AddPropertyPage.addPropertyText);
        assertTrue(AddPropertyPage.addPropertyText.isDisplayed());
    }
}
