package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.StorePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestLocateStore extends BasePage {
    @Test
    public void testLocateStore(){
        HomePage homePage = new HomePage();
        homePage.findStore().selectStore();
        waitForVisibilityOfElement(StorePage.storeLocation);
        assertTrue(StorePage.storeLocation.isDisplayed());
    }
}
