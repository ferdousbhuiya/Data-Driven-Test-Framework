package PageLibrary;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemPage extends BasePage {

   //

    //id = "isCartBtn_btn"    old one
    @FindBy(xpath = "(//a[@class = 'ux-call-to-action fake-btn fake-btn--fluid fake-btn--primary'])[2]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//select[@aria-label='Please select a Size']")
    public WebElement sizeDropdownBox;

    @FindBy(xpath = "//select[@aria-label='Please select a Color']")
    public WebElement colorDropdownBox;

    @FindBy(xpath = "//span[contains(text(),'Go to cart')]")
    public WebElement GotoCartBtn;

    @FindBy(id = "atcRedesignId_btn")
    public WebElement addJeansToCartButton;
    @FindBy(xpath = "//h2[contains(text(),'1 item added to cart')]")
    public static WebElement itemAddedToCartText;

    @FindBy(xpath = "//div[@class='vi_oly_clz_cntr']/button")
    public  WebElement closeButton;

    @FindBy(xpath = "//button[contains(text(),'No thanks')]")
    public WebElement notThanksButton;

    //(//button[@class='fake-link'])[2]    /Remove Button

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
        clickOnElement(sizeDropdownBox);
        selectFromDropdownByIndex(sizeDropdownBox,3);
        clickOnElement(colorDropdownBox);
        selectFromDropdownByIndex(colorDropdownBox, 3);
        clickOnElement(addToCartButton);
        clickOnElement(GotoCartBtn);
        //waitForVisibilityOfElement(notThanksButton);
        //clickOnElement(notThanksButton);
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