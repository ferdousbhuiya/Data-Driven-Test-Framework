package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@class='custom-button __b secondary']")
    public WebElement registerButton;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public RegistrationPage clickRegisterButton(){
        clickOnElement(registerButton);
        return new RegistrationPage();
    }
}
