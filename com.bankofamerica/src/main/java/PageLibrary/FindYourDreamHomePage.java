package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class FindYourDreamHomePage extends BasePage {

    @FindBy(id = "Criteria/Location")
    public WebElement searchInputField;
    @FindBy(id = "broker-warning-confirm")
    public static WebElement result;
    @FindBy(id = "search-submit-button")
    public WebElement searchButton;

    public FindYourDreamHomePage(){
        PageFactory.initElements(driver,this);
    }

    public void searchForHome() throws SQLException {
        String query = db.executeQueryReadOne("SELECT * FROM locations.cities where city= 'Philadelphia, pa';").toString();
        sendKeysToElement(searchInputField, query);
        clickOnElement(searchButton);

    }
}
