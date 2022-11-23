package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.Xfinity;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestShopSmartWifi6 extends BasePage {
    @Test
    public void testSHoppingSmartWifi() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.shopInternetSmartWifi().shoppSmartWifi().fillOut();
        waitForVisibilityOfElement(Xfinity.headerText);
        assertTrue(Xfinity.headerText.isDisplayed());
    }
}