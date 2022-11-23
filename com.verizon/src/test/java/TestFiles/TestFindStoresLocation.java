package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchStoresLocationResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestFindStoresLocation extends BasePage {

    @Test
    public void testStoresLocation() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.findStoresLocation().searchStore();
        assertTrue(isElementVisible(SearchStoresLocationResultPage.mapResult));
    }

}
