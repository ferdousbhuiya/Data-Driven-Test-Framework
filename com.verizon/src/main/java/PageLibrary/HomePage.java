package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLException;
import java.util.List;

public class HomePage extends BasePage {


        @FindBy(id = "gnav20-sign-id")
        public WebElement signInButton;

        //div[@class='gnav20-utility-wrapper']//div//a[@aria-label='Stores'][normalize-space()='Stores']
        @FindBy(xpath = "//div[@class='gnav20-row-one opacityOne']/div[2]/div[1]//a")
        public WebElement storeLink;

        @FindBy(id = "gnav20-search-icon")
        public WebElement searchButton;

        @FindBy(id = "search_box_gnav_input")
        public WebElement searchInput;

        @FindBy(xpath = "//div[@class='listContainer']/li")
        public List<WebElement> suggestedList;

        @FindBy(xpath = "//ul[@class='gnav20-dropdown']/li[2]")
        public WebElement signInToMyAccountButton;

        @FindBy(xpath = "//button[@id='gnav20-Shop-L1']")
        public WebElement shopLink;

        @FindBy(id = "gnav20-Support-L1")
        public WebElement supportLink;

        @FindBy(id = "gnav20-Support-L2-1")
        public WebElement supportOverview;

        @FindBy(id = "gnav20-Shop-L2-3")
        public WebElement deviceLink;

        @FindBy(id= "gnav20-Shop-L2-4")
        public WebElement accessoriesLink;

        @FindBy(id = "gnav20-Shop-L3-48")
        public WebElement chargingLink;

        @FindBy(xpath = "//a[@id='gnav20-Shop-L3-1']")
        public WebElement smartPhoneLink;


        public HomePage() {
            PageFactory.initElements(driver, this);
        }

        public SignInPage signIn() {

            waitForVisibilityOfElement(signInButton);
            clickOnElement(signInButton);
            clickOnElement(signInToMyAccountButton);
            return new SignInPage();
        }

        public ItemsPage shopSmartPhone() {
            clickOnElement(shopLink);
            waitForVisibilityOfElement(deviceLink);
            clickOnElement(deviceLink);
            waitForVisibilityOfElement(smartPhoneLink);
            clickOnElement(smartPhoneLink);
            return new ItemsPage();
        }

        public SearchedItemPage searchItem() throws SQLException {
            String item = "SELECT word FROM locations.searchingword where id =2;";
            waitForVisibilityOfElement(searchButton);
            clickOnElement(searchButton);
            waitForVisibilityOfElement(searchInput);
            sendKeysToElement(searchInput, db.executeQueryReadOne(item).toString());
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Suggested searches')]")));
            clickOnElement(suggestedList.get(0).findElement(By.tagName("a")));
            return new SearchedItemPage();
        }

        public SupportPage chatWithUs() {
            waitForVisibilityOfElement(supportLink);
            moveToElementAndClick(supportLink);
            waitForVisibilityOfElement(supportOverview);
            moveToElementAndClick(supportOverview);
            return new SupportPage();
        }

        public StoresPage findStoresLocation() {
            clickOnElement(storeLink);
            return new StoresPage();
        }
        public ChargingPage shopChargingAccessories(){
            clickOnElement(shopLink);
            waitForVisibilityOfElement(accessoriesLink);
            clickOnElement(accessoriesLink);
            waitForVisibilityOfElement(chargingLink);
            clickOnElement(chargingLink);
            return new ChargingPage();

        }
    }


