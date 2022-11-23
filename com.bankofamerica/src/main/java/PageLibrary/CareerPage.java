package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLException;

public class CareerPage extends BasePage {

    @FindBy(xpath = "//div[@class='right-nav__section']/button")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@class='homepage-masthead__search-bar js-search-bar']/button")
    public WebElement secondSearchButton;
    @FindBy(id = "location-selector")
    public WebElement locationInputField;
    @FindBy(xpath = "//body/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/span/a")
    public WebElement allPositionsLink;

    public CareerPage() {
        PageFactory.initElements(driver, this);
    }

    public JobResultPage clickSearchJobButton() throws SQLException {
//        clickOnElement(searchButton);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='t-track-job-tile-all-positions']")));
        jsClickOnElement(allPositionsLink);
//        String query = db.executeQueryReadOne("SELECT * FROM locations.cities where city= 'Philadelphia, pa';").toString();
//         waitTheVisibilityOfElement(locationInputField);
//        sendKeysToElement(locationInputField,db.executeQueryReadOne(query).toString());
//        selectFromDropdownByIndex(locationInputField,0);
//        waitTheVisibilityOfElement(secondSearchButton);
//        clickOnElement(secondSearchButton);

        return new JobResultPage();
    }

}
