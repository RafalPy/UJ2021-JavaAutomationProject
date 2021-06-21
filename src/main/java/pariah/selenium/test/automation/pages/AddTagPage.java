package pariah.selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTagPage extends DefaultPage{

    @FindBy(id = "name")
    public WebElement tagNameField;

    @FindBy(id = "save")
    private WebElement tagSaveButton;



    public AddTagPage(WebDriver driver) {
        super(driver);
    }

    public void fillTagNameField (String name) {
        fillElement(tagNameField, name);
    }

    public void submitAddTag () {
        clickElement(tagSaveButton);
    }


}
