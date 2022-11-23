package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;
import java.util.List;

public class StoresPage extends BasePage {
    @FindBy(id = "storesData")
    public WebElement searchInput;

    @FindBy(xpath = "//ul[@id='autocomplete-options--stores']/li")
    public List<WebElement> resultSuggestion;
    public StoresPage(){
        PageFactory.initElements(driver,this);
    }

    public SearchStoresLocationResultPage searchStore() throws SQLException, SQLException {
        String zipCode="SELECT zipcode FROM locations.zipcode where id =1; ";
        sendKeysToElement(searchInput, db.executeQueryReadOne(zipCode).toString());
       // waitForThePresenceOfTheElement(By.xpath("//ul[@id='autocomplete-options--stores']/li[1]"));
        jsClickOnElement(resultSuggestion.get(0));
        return new SearchStoresLocationResultPage();
    }

}
