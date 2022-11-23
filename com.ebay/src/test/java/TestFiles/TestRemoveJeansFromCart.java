package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestRemoveJeansFromCart extends BasePage {
    @Test
    public void testRemovingJeansFromCart(){
        HomePage homePage = new HomePage();
        homePage.navigateToClothsAndAccessoriesPage()
                .navigateToJeansPage()
                .shopTopBrand()
                .selectJeans()
                .addJeansToCart()
                .deleteJeanFromCart();
        assertTrue(isElementVisible(ItemPage.cartIsEmptyText));
    }

}
