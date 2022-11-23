package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='nav-list']")
    public List<WebElement> navList;


    //--------internet---------------
    @FindBy(xpath = "//ul[@class='nav-list']/li[1]/div[2]//ul/li")
    public List<WebElement> internetNavDropDown;
    //------------------------------------------
    @FindBy(xpath = "//div[@class='header-item store-locator']")
    public WebElement storeLocator;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public Internet5GiPage check5GiAvailability() {
        hoverOverElement(navList.get(0).findElement(By.tagName("a")));
        waitForVisibilityOfElement(internetNavDropDown.get(1));
        jsClickOnElement(internetNavDropDown.get(1).findElement(By.tagName("a")));
        return new Internet5GiPage();
    }

    public InternetSmartWifi6PAge shopInternetSmartWifi() {
        hoverOverElement(navList.get(0).findElement(By.tagName("a")));
        waitForVisibilityOfElement(internetNavDropDown.get(2));
        jsClickOnElement(internetNavDropDown.get(2).findElement(By.tagName("a")));
        return new InternetSmartWifi6PAge();
    }

    public AffordableConnectivityPage applyForFreeInternet() {
        hoverOverElement(navList.get(0).findElement(By.tagName("a")));
        waitForVisibilityOfElement(internetNavDropDown.get(3));
        jsClickOnElement(internetNavDropDown.get(3).findElement(By.tagName("a")));
        return new AffordableConnectivityPage();
    }
    public FindStorePage findStore(){
        clickOnElement(storeLocator);
        return  new FindStorePage();

    }
}