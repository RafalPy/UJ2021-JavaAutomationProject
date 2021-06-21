package pariah.selenium.test.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pariah.selenium.test.automation.pages.AddEnvironmentPage;
import pariah.selenium.test.automation.pages.DashboardPage;
import pariah.selenium.test.automation.pages.EnvironmentListPage;

import java.util.Date;

public class AddEnvironmentTest extends DefaultTest {

    @Test
    public void successAddEnvironmentTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.goToEnvironmentListPage();

        EnvironmentListPage environmentListPage = new EnvironmentListPage(driver);
        environmentListPage.goToAddEnvironmentPage();

        AddEnvironmentPage addEnvironmentPage = new AddEnvironmentPage(driver);
        addEnvironmentPage.fillAddEnvironmentForm(new Date().getTime() + "_env", baseGenerator.generateString(255));
        addEnvironmentPage.submitAddEnvironmentForm();


        environmentListPage = new EnvironmentListPage(driver);
        Assert.assertTrue(environmentListPage.isInfoBoxDisplayed());

    }

}
