package TestFiles;

import PageLibrary.AccessoryPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddSmartPhoneToCart extends BasePage {
    @Test
    public void testChoosingPlan(){
        HomePage homePage = new HomePage();
        homePage.shopSmartPhone().selectPhone().addPhoneToCart();
        assertTrue(isElementVisible(AccessoryPage.addedToCartText));
    }

}
