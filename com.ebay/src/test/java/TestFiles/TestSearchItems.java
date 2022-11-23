package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchItems extends BasePage {
    @Test
    public void testSearchingItems() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.searchForItems();
        assertTrue(isElementVisible(SearchResultPage.results));

    }
}
