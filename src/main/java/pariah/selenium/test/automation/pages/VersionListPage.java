package pariah.selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VersionListPage extends DefaultPage {

    @FindBy(css= "#content > article > div:nth-child(1) > nav > ul > li > a")
    private WebElement addVersionPageLink;

    @FindBy(id="j_info_box")
    private WebElement infoBox;

    public VersionListPage(WebDriver driver) {
        super(driver);
    }

    public void goToAddVersionPage() {
        clickElement(addVersionPageLink);
    }

    public boolean isInfoBoxDisplayed () {
        return isElementDisplayed(infoBox);
    }
}
