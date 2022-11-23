package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;

public class TestAddToCart extends BasePage {
    @Test
    public void testAddToCart() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.searchForItems().selectItem().addToCart();
        assertEquals("number of items is 1",HomePage.numberOfItem.getText(),"1");
    }
}
