package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SaveAndCompleteLaterPage;
import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestApplyingForCreditCards extends BasePage {
    @Test
    public void testApplyingForCreditCard() throws InterruptedException {
        HomePage homePage =new HomePage();
        homePage.clickOnStudentCreditCards().applyNow().fillOutThForm();
        webDriverWait.until(ExpectedConditions.visibilityOf(SaveAndCompleteLaterPage.saveAndComplete));
        assertTrue(SaveAndCompleteLaterPage.saveAndComplete.isDisplayed());

    }

}
