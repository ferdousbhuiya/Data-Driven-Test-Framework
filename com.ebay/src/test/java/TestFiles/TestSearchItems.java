package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchItems extends BasePage {
    @Test(dataProvider ="ItemsToSearch" )
    public void testSearchingItems(String item) throws SQLException {
        HomePage homePage = new HomePage();
        homePage.searchForItems(item);
        assertTrue(isElementVisible(SearchResultPage.results));

    }

    @DataProvider
    public Object[][] ItemsToSearch()
    {
        String [][] data;
        data = excel.readStringArrays("Sheet1");
        return data;
    }
}
