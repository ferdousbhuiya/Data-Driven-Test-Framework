package TestFiles;

import PageLibrary.BrandJeansPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestSearchLevisJeansForMen extends BasePage {
    @Test
    public void testShoppingLevisMenJeans(){
        HomePage homePage = new HomePage();
        homePage.navigateToClothsAndAccessoriesPage().navigateToJeansPage().shopTopBrand();
        assertTrue(isElementVisible(BrandJeansPage.branJeansName));
    }
}
