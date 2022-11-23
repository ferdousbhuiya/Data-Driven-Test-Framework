package TestFiles;

import PageLibrary.ExpressCartPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestShopCharger extends BasePage {

    @Test
    public void testShoppingCharger(){
        HomePage homePage =new HomePage();
        homePage.shopChargingAccessories()
                .selectCharger()
                .addChargerToCart();
        assertTrue(isElementVisible(ExpressCartPage.shoppingCartItems));


    }
}
