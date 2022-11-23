package PageLibrary;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;

public class CheckAvailabilityPage extends BasePage {
    @FindBy(id = "streetAddress")
    public WebElement streetAddressInput;

    @FindBy(id = "zipCode")
    public WebElement zipcode;

    @FindBy(xpath= "//div[@class='is-large-screen']/div[2]//button")
    public static WebElement checkAvailabilityButton;
    @FindBy(id= "buyflow")
    public static WebElement specialOfferHeader;
    public CheckAvailabilityPage(){
        PageFactory.initElements(driver,this);
    }

    public Xfinity fillOut() throws SQLException {
        String address="SELECT addresss FROM locations.address where id =1;";
        String zipCod="SELECT zipcode FROM locations.zipcode where id =1;";
        sendKeysToElement(streetAddressInput, db.executeQueryReadOne(address).toString());
        sendKeysToElement(zipcode,db.executeQueryReadOne(zipCod).toString());
        jsClickOnElement(checkAvailabilityButton);
        return new Xfinity();
    }

}
