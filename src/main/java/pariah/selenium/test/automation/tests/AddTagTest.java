package pariah.selenium.test.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pariah.selenium.test.automation.pages.AddTagPage;
import pariah.selenium.test.automation.pages.DashboardPage;
import pariah.selenium.test.automation.pages.TagListPage;

import java.util.Date;

public class AddTagTest extends DefaultTest{

    @Test
    public void successAddTagTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.goToTagsListPage();

        TagListPage tagListPage = new TagListPage(driver);
        tagListPage.goToAddTagPage();

        AddTagPage addTagPage = new AddTagPage(driver);
        addTagPage.fillTagNameField(new Date().getTime() + "_tagR");
        addTagPage.submitAddTag();

        tagListPage = new TagListPage(driver);
        Assert.assertTrue(tagListPage.isInfoBoxDisplayed());
    }
}
