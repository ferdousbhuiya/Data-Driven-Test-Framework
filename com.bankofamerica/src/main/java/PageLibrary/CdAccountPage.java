package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.GenerateData;
import java.sql.SQLException;

public class CdAccountPage extends BasePage {

    @FindBy(id = "compare-accounts-large")
    public WebElement compareCdAccountButton;
    @FindBy(id = "compare-featuredCDOpenNow")
    public WebElement getStartedButton;
    @FindBy(id = "zipCodeModalInputField")
    public WebElement zipCodeInputField;
    @FindBy(id = "go-button-zip-modal")
    public WebElement goButton;
    @FindBy(id = "minimumTermDays-selectdeposits-modal")
    public WebElement selectTerm;
    @FindBy(xpath = "//select[@id='minimumTermDays-selectdeposits-modal']/option[2]")
    public WebElement sevenMonthTerm;
    @FindBy(id = "range-selectdeposits-modal")
    public WebElement openingDepositAmount;
    @FindBy(xpath = "//select[@id='range-selectdeposits-modal']/option[2]")
    public WebElement lessThan10K;
    @FindBy(id = "modalOpenNowFeaturedCdAccount")
    public WebElement openNowButton;

    public CdAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public ApplyingCdsAccountPage applyingForCDsAccount() throws SQLException {
        String query="SELECT * FROM locations.zipcode where zipCode =19145;";
        sendKeysToElement(zipCodeInputField,db.executeQueryReadAll(query).toString() );
        clickOnElement(goButton);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("compare-accounts-large")));
        jsClickOnElement(compareCdAccountButton);
        //waitTheVisibilityOfElement(getStartedButton);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("compare-featuredCDOpenNow")));
        jsClickOnElement(getStartedButton);
        clickOnElement(selectTerm);
        clickOnElement(sevenMonthTerm);
        clickOnElement(openingDepositAmount);
        clickOnElement(lessThan10K);
        clickOnElement(openNowButton);
        return new ApplyingCdsAccountPage();
    }


}
