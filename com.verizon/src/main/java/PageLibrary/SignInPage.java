package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//input[@id='IDToken1']")
    public WebElement emailInInput;

    @FindBy(xpath = "//button[@id='continueBtn']")
    public WebElement continueButton;

    @FindBy(xpath = "//body/main[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
    public WebElement passwordInput;

    @FindBy(xpath = "//body/main[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
    public WebElement signInButton;

    @FindBy(xpath = "//h1[contains(text(),'Sign in')]")
    public static WebElement signInText;

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    public UserAccountPage fillOutSignInForm() throws SQLException, SQLException {
        //String email="SELECT email FROM locations.emails where emailID=2;";
        //String password="SELECT password FROM locations.password where id =3;";
        sendKeysToElement(emailInInput,excel.readStringArrays("Sheet1")[0][1]);
        sendKeysToElement(passwordInput,excel.readStringArrays("Sheet1")[0][2]);
        waitForVisibilityOfElement(signInButton);
        jsClickOnElement(signInButton);
        return new UserAccountPage();
    }

}
