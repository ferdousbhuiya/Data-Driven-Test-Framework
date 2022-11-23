package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class FinancialCenterPage extends BasePage {
    @FindBy(id = "q")
    public WebElement inputSearchField;

    @FindBy(id = "search-button")
    public WebElement searchButton;

    @FindBy(xpath = "//ul[@role='list']/li[1]/div/a[2]")
    public WebElement financialLocation;


    public FinancialCenterPage(){
        PageFactory.initElements(driver,this);
    }
    public LocationCenter searchFinancialCenter() throws  SQLException {
        String query = "SELECT * FROM locations.cities where city= 'Philadelphia, pa';";
        sendKeysToElement(inputSearchField,db.executeQueryReadOne(query).toString());
        clickOnElement(searchButton);
        clickOnElement(financialLocation);
        return new LocationCenter();
    }

}
