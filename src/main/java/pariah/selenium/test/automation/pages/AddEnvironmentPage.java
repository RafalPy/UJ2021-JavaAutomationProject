package pariah.selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEnvironmentPage extends DefaultPage{

    @FindBy(id ="name")
    public WebElement nameField;

    @FindBy(id = "description")
    public WebElement descriptionField;

    @FindBy(id = "save")
    public WebElement saveButton;


    public AddEnvironmentPage(WebDriver driver) {
        super(driver);
    }

    public void fillAddEnvironmentForm(String name, String description) {
        fillElement(nameField, name);
        fillElement(descriptionField, description);
    }

    public void submitAddEnvironmentForm() {
        clickElement(saveButton);
    }
}
