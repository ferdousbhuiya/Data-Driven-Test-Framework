package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.WealthManagementPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestConnectWithAdvisor extends BasePage {

    @Test
    public void testConnectingWithMerrillAdvisor() throws SQLException {
        HomePage homePage= new HomePage();
        homePage.clickWealthManagementLink().fillOutConnectForm();
        //waitTheVisibilityOfElement(WealthManagementPage.confirmationMessage);
        assertTrue(WealthManagementPage.confirmationMessage.isDisplayed());
    }
}
