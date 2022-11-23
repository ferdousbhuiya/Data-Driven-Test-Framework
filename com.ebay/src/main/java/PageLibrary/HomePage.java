package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;
import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul/li[3]")
    public WebElement motorsButton;


    @FindBy(xpath = "//div[@class='hl-cat-nav']/ul/li[7]")
    public WebElement clothingAndAccessoriesLink;

    @FindBy(xpath = "//table[@class='gh-tbl2']/tbody/tr[1]/td[1]//input[1]")
    public WebElement searchInput;

    @FindBy(xpath = "//table[@class='gh-tbl2']/tbody/tr[1]/td[3]//input[1]")
    public WebElement searchButton;

    @FindBy(id = "gh-cart-n")
    public static WebElement numberOfItem;

    @FindBy(xpath = "//ul[@id='gh-eb']/li")
    public List<WebElement> rightNavBar;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public MotorsPage addVehicle() {
        waitForVisibilityOfElement(motorsButton);
        clickOnElement(motorsButton);
        return new MotorsPage();
    }

    public SearchResultPage searchForItems() throws SQLException {
        String item = "SELECT word FROM locations.searchingword where id =1;";
        waitForVisibilityOfElement(searchInput);
        sendKeysToElement(searchInput, db.executeQueryReadOne(item).toString());
        moveToElementAndClick(searchButton);
        return new SearchResultPage();

    }
    public ClothingAndAccessoriesPage navigateToClothsAndAccessoriesPage(){
        waitForVisibilityOfElement(clothingAndAccessoriesLink);
        clickOnElement(clothingAndAccessoriesLink);
        return new ClothingAndAccessoriesPage();
    }


}