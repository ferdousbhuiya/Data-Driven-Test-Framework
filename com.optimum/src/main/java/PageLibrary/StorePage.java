package PageLibrary;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends BasePage {
    @FindBy(id = "dir-map")
    public static WebElement storeLocation;
    public StorePage(){
        PageFactory.initElements(driver,this);
    }
}
