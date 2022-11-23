package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestFreedInternet extends BasePage {
    @Test
    public void testFreeInternet(){
        HomePage homePage = new HomePage();
        homePage.applyForFreeInternet().checkAvailability();
    }
}
