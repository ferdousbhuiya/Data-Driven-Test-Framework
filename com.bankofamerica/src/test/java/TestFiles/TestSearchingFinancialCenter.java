package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.LocationCenter;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchingFinancialCenter extends BasePage {
    @Test
    public void testingSearchingFinancialCenter() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.clickFinancialCenterLink().searchFinancialCenter();
        assertTrue(LocationCenter.locationCenterName.isDisplayed());

    }

}
