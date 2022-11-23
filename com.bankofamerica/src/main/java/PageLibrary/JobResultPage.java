package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;

public class JobResultPage extends BasePage {
    @FindBy(xpath = "//input[@class='keyword__magnifier js-keyword-magnifier']")
    public WebElement searchButton;
    @FindBy(id = "span_results")
    public static WebElement jobResult;

    @FindBy(xpath = "//div[@class='selector__dropdown keyword-selector']/input[@placeholder='Keyword or requisition #']")
    public WebElement searchKeyInputField;

    @FindBy(xpath = "//div[@id='mainContentStart']/div/div//div[@class='content__search--location active']//input")
    public WebElement locationInputField;


    public JobResultPage() {
        PageFactory.initElements(driver, this);
    }

    public void searchJob() throws SQLException {
        String query = "SELECT * FROM locations.cities where city= 'Philadelphia, pa';";
        //waitTheVisibilityOfElement(searchKeyInputField);
        sendKeysToElement(searchKeyInputField, GenerateData.job());
        clickOnElement(locationInputField);
        clearSendKeysToElement(locationInputField, db.executeQueryReadOne(query).toString());
//        sendKeysToElement(locationInputField,db.executeQueryReadOne(query).toString());
//        selectFromDropdownByIndex(locationInputField,1);
        clickOnElement(searchButton);
    }
}
