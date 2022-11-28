package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;

public class TestAddToCart extends BasePage {
    @Test(dataProvider = "ItemsToAdd")
    public void testAddToCart(String item) throws SQLException {
        HomePage homePage = new HomePage();
        homePage.searchForItems(item).selectItem().addToCart();
        assertEquals("number of items is 1",HomePage.numberOfItem.getText(),"1");
    }

    @DataProvider
    public Object[][] ItemsToAdd()
    {
        String [][] data;
        data = excel.readStringArrays("Sheet1");
        return data;
    }
}
