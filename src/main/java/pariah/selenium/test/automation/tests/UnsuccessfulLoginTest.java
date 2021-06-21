package pariah.selenium.test.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pariah.selenium.test.automation.pages.DashboardPage;
import pariah.selenium.test.automation.pages.LoginPage;

public class UnsuccessfulLoginTest extends DefaultTest {

    @Test
    public void unsuccessfulLoginTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("administrator@testarena.pl", "asumXQQ72$L");
        loginPage.submitLoginForm();


        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isLoginFormErrorDisplayed());
    }

}