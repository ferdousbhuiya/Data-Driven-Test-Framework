package TestFiles;

import PageLibrary.ApplyingCdsAccountPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestApplyingToCdsAccount extends BasePage {

    @Test
    public void testApplyingToCdsAccount() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.savingClickOnCDsLink().applyingForCDsAccount();
        assertTrue(ApplyingCdsAccountPage.startApplicationForm.isDisplayed());
    }
}
