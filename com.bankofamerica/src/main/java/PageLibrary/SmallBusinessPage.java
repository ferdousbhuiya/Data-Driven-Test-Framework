package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallBusinessPage extends BasePage {

    @FindBy(id = "navLending")
    public WebElement lendingLink;

    @FindBy(id = "franchiseFinancing")
    public WebElement franchiseFinancingLink;


    public SmallBusinessPage(){
        PageFactory.initElements(driver,this);
    }

    public FranchiseFinancePage clickFranchiseFinancingLink(){
        clickOnElement(lendingLink);
        clickOnElement(franchiseFinancingLink);
        return new FranchiseFinancePage();
    }
}
