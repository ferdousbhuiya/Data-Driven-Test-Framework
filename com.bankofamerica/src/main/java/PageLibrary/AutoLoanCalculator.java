package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class AutoLoanCalculator extends BasePage {

    @FindBy(id = "totalLoanAmountField")
    public WebElement loanAmountField;

    @FindBy(id = "term")
    public WebElement termField;

    @FindBy(id = "interestRateField")
    public WebElement interestRateField;

    @FindBy(id = "calculateButton")
    public WebElement calculateButton;

    @FindBy(xpath = "//div[@class='results']")
    public static WebElement result;

    @FindBy(id = "stateSelectModal")
    public WebElement selectState;

    @FindBy(id = "stateSelectorSubmit")
    public WebElement goButton;


    public AutoLoanCalculator() {
        PageFactory.initElements(driver, this);
    }

    public void calculatePayment() throws SQLException {
        String amountQuery = "SELECT loan_amount FROM locations.loan_calculator where id =1;";
        String termQuery = "SELECT term FROM locations.loan_calculator where id =1;";
        String interestQuery = "SELECT interest_rate FROM locations.loan_calculator where id =1;";
        selectFromDropdownByIndex(selectState,5);
        clickOnElement(goButton);
        clearSendKeysToElement(loanAmountField, db.executeQueryReadOne(amountQuery).toString());
        clearSendKeysToElement(termField, db.executeQueryReadOne(termQuery).toString());
        clearSendKeysToElement(interestRateField, db.executeQueryReadOne(interestQuery).toString());
        clickOnElement(calculateButton);
    }
}
