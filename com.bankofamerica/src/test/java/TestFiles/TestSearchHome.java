package TestFiles;

import PageLibrary.FindYourDreamHomePage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchHome extends BasePage {

    @Test
    public void testSearchingHome() throws SQLException {
        HomePage homePage= new HomePage();
        homePage.clickHomeLoanLink().searchForHome();
        //waitTheVisibilityOfElement(FindYourDreamHomePage.result);
        assertTrue(FindYourDreamHomePage.result.isDisplayed());
    }
}
