package TestFiles;

import PageLibrary.ExpressCartPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestRemoveItemFromCart extends BasePage {
    @Test
    public void testRemovingItemFromCart(){
        HomePage homePage = new HomePage();
        homePage.shopSmartPhone()
                .selectPhone()
                .addPhoneToCart()
                .navigateToExpressCart()
                .navigateToChoosePlan()
                .navigateToProtectionPage()
                .chooseProtection()
                .removeItemFromCart();
        assertTrue(isElementVisible(ExpressCartPage.yourCartIsEmptyText));
    }
}
