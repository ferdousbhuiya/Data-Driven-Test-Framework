package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.UserAccountPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class TestDeleteEventCalendar extends BasePage {

    @Test
    public void testingDeleteEventCalendar() throws SQLException, SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToLoginPage().login().deleteCalendarEvent();
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[2]"));
        hoverOverElement(UserAccountPage.mainNavBar.get(1));
        clickOnElement(UserAccountPage.mainNavBar.get(1).findElement(By.tagName("a")));
        clickOnElement(UserAccountPage.agendaButton);
        waitForVisibilityOfElement(UserAccountPage.eventToEdit);
        assertTrue(UserAccountPage.eventToEdit.isDisplayed());

    }

}
