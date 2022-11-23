package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SearchedItemPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;

public class TestSearchingForItem extends BasePage {

    @Test
    public void testSearchingItem() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.searchItem();
        String searchedItem="SELECT word FROM locations.searchingword where id =2;";
        assertEquals(SearchedItemPage.searchedItem.getAttribute("value").trim().toLowerCase(),db.executeQueryReadOne(searchedItem).toString().trim().toLowerCase());

    }
}
