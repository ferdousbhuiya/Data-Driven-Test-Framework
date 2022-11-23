package PageLibrary;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemPage extends BasePage {

    @FindBy(id = "isCartBtn_btn")
    public WebElement addToCartButton;
    @FindBy(id = "atcRedesignId_btn")
    public WebElement addJeansToCartButton;
    @FindBy(xpath = "//h2[contains(text(),'1 item added to cart')]")
    public static WebElement itemAddedToCartText;

    @FindBy(xpath = "//div[@class='vi_oly_clz_cntr']/button")
    public  WebElement closeButton;

    @FindBy(xpath = "//button[contains(text(),'No thanks')]")
    public WebElement notThanksButton;

    @FindBy(xpath = "//div[@class='listsummary']/div[2]/span[2]//button")
    public WebElement removeButton;

    @FindBy(xpath = "//div[@class='listsummary']/div[2]/span[2]//button")
    public static WebElement dontHaveAnyItemText;

    @FindBy(xpath = "//h2[contains(text(),'Your cart is empty')]")
    public static WebElement cartIsEmptyText;

    @FindBy(xpath = "//div[@class='gh-minicart-body']/div[1]//button")
    public  WebElement shoppingCartRemoveButton;

    @FindBy(xpath = "//ul[@id='gh-eb']/li")
    public List<WebElement> rightNavBar;

    public ItemPage() {
        PageFactory.initElements(driver, this);
    }

    public ItemPage addToCart() {
        waitForVisibilityOfElement(addToCartButton);
        clickOnElement(addToCartButton);
        waitForVisibilityOfElement(notThanksButton);
        clickOnElement(notThanksButton);
        return new ItemPage();
    }

    public void removeItemFromCart() {
        waitForVisibilityOfElement(removeButton);
        clickOnElement(removeButton);
    }

    public ItemPage addJeansToCart() {
        waitForVisibilityOfElement(addJeansToCartButton);
        clickOnElement(addJeansToCartButton);
        return new ItemPage();
    }

    public void deleteJeanFromCart() {
        clickOnElement(closeButton);
        hoverOverElement(rightNavBar.get(4));
        waitForVisibilityOfElement(shoppingCartRemoveButton);
        clickOnElement(shoppingCartRemoveButton);
    }


}