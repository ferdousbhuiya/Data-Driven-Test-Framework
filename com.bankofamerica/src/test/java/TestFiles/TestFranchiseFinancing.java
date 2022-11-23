package TestFiles;

import PageLibrary.FranchiseConfirmationPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestFranchiseFinancing extends BasePage {

    @Test
    public void testingFranchiseFinancing(){
        HomePage homePage = new HomePage();
        homePage.clickSmallBusinessLink().clickFranchiseFinancingLink().fillOutTheForm();
        //waitTheVisibilityOfElement(FranchiseConfirmationPage.confirmationResult);
        assertTrue(FranchiseConfirmationPage.confirmationResult.isDisplayed());
    }
}
