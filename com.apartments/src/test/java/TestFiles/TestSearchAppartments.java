package TestFiles;

import PageLibrary.AppartmentResultPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchAppartments extends BasePage {
    @Test
    public void testSearchApartments() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.signInUsingExistentAccount().searchApartments();
        waitForVisibilityOfElement(AppartmentResultPage.renterViewText);
        assertTrue(AppartmentResultPage.renterViewText.isDisplayed());
    }
}
