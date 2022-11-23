package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestRemoveItem extends BasePage {
    @Test
    public void testRemovingItemFromCart() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.searchForItems().selectItem().addToCart().removeItemFromCart();
        assertTrue(isElementVisible(ItemPage.dontHaveAnyItemText));
    }

}