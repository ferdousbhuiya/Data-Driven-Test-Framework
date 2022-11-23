package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

    @FindBy(name = "uid")
    public WebElement userid;

    @FindBy(name = "password")
    public WebElement userpassword;

    @FindBy(name = "btnLogin")
    public WebElement loginButton;


    public LogInPage()  {

        PageFactory.initElements(driver, this);
    }


    public void loginToApplication(String aUsername, String aPassword)
    {
        sendKeysToElement(userid, aUsername);
        sendKeysToElement(userpassword, aPassword);
       safeClickOnElement(loginButton);
    }

}
