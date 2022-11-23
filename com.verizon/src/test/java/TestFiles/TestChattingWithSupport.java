package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SupportPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestChattingWithSupport extends BasePage {

    @Test
    public void testChattingWithSupport(){

        HomePage homePage =new HomePage();
        homePage.chatWithUs().chatAboutMobile();
        waitForVisibilityOfElement(SupportPage.iframeChat);
        switchToFrameByElement(SupportPage.iframeChat);
        assertTrue(isElementVisible(SupportPage.chatTextArea));

    }

}
