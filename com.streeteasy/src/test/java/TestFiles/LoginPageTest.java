package TestFiles;

import PageLibrary.LogInPage;
import TestDataSource.TestData;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePage {

    @Test(dataProvider = "dataFromExcell", dataProviderClass = TestData.class )
   // @Test(dataProvider = "getData", dataProviderClass = TestData.class)//This is for retrive data from TestData File
    public void verifyLogin(String username, String password)  {
        LogInPage logInPage = new LogInPage();
        logInPage.loginToApplication(username, password);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Guru99 Bank Manager HomePage";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
