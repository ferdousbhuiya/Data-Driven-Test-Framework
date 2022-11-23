package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.ItemPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddJeansToCart extends BasePage {
    @Test
    public void testAddingJeansToCart(){
        HomePage homePage = new HomePage();
        homePage.navigateToClothsAndAccessoriesPage()
                .navigateToJeansPage()
                .shopTopBrand()
                .selectJeans()
                .addJeansToCart();
        assertTrue(isElementVisible(ItemPage.itemAddedToCartText ));

    }
}
