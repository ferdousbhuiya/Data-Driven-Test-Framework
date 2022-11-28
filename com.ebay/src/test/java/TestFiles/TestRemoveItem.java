package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import PageLibrary.SearchResultPage;
import base.BasePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestRemoveItem extends BasePage {
    @Test(dataProvider = "ItemsToRemove")
    public void testRemovingItemFromCart(String item) throws SQLException {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        ItemPage itemPage = new ItemPage();
        homePage.searchForItems(item);
        searchResultPage.selectItem();
        itemPage.addToCart();
        itemPage.removeItemFromCart();
        assertTrue(isElementVisible(ItemPage.dontHaveAnyItemText));
    }


    @DataProvider
    public Object[][] ItemsToRemove()
    {
        String [][] data;
        data = excel.readStringArrays("Sheet1");
        return data;
    }
}