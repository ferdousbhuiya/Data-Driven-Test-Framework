package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestSignInUsingExistingAccount extends BasePage {

    @Test
    public void SignInUsingExistentAccount() throws  SQLException {
        HomePage homePage= new HomePage();
        homePage.signInUsingExistentAccount();


    }

}
