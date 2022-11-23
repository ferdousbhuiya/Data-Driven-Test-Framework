package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.JobResultPage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchJob extends BasePage {

    @Test
    public void testSearchingJob() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.clickCareerLink().clickSearchJobButton().searchJob();
        assertTrue(JobResultPage.jobResult.isDisplayed());
    }
}
