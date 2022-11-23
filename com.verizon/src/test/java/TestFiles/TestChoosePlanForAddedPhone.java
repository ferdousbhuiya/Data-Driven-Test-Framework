package TestFiles;

import PageLibrary.ExpressCartPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestChoosePlanForAddedPhone extends BasePage {

    @Test
    public void testAddingSmartPhoneToCart(){
        HomePage homePage = new HomePage();
        homePage.shopSmartPhone()
                .selectPhone()
                .addPhoneToCart()
                .navigateToExpressCart()
                .navigateToChoosePlan()
                .navigateToProtectionPage()
                .chooseProtection();
        assertTrue(isElementVisible(ExpressCartPage.whatInYourCartText));
    }
}
