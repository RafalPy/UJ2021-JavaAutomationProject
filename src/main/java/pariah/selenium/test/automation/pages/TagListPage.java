package pariah.selenium.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class TagListPage extends DefaultPage{

    @FindBy(xpath = "//html/body/div[1]/section/article/div[1]/nav/ul/li/a")
    public WebElement addTagLink;

    @FindBy(id="j_info_box")
    private WebElement infoBox;

    public TagListPage(WebDriver driver) {
        super(driver);
    }

    public void goToAddTagPage() {
        clickElement(addTagLink);
    }

    public boolean isInfoBoxDisplayed () {
        return isElementDisplayed(infoBox);
    }
}
