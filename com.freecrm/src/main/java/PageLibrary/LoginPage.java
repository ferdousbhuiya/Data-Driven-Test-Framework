package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailAddressInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public UserAccountPage login() throws SQLException {
        String emailInput="SELECT email FROM locations.emails where emailID=3;";
        String password="SELECT password FROM locations.password where id =3;";
        clearSendKeysToElement(emailAddressInput,db.executeQueryReadOne(emailInput).toString());
        clearSendKeysToElement(passwordInput,db.executeQueryReadOne(password).toString());
        clickOnElement(loginButton);
        return new UserAccountPage();

    }
}
