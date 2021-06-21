package pariah.selenium.test.automation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pariah.selenium.test.automation.pages.DashboardPage;
import pariah.selenium.test.automation.pages.LoginPage;

public class LogOutTest extends DefaultTest {

    @Test
            public void LogoutTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickLogout();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(LoginPage.isLoginButtonDisplayed());

    }
}
