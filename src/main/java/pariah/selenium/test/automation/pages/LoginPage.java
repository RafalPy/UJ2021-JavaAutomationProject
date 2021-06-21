package pariah.selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.management.LockInfo;

public class LoginPage extends DefaultPage {


    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password" )
    private WebElement passwordField;

    @FindBy(id = "login")
    private static WebElement loginButton;


    public LoginPage(WebDriver driver) {
       super(driver);

    }

    public void fillLoginForm(String email, String password) {
        fillElement(emailField,email);
        fillElement(passwordField,password);

    }

    public void submitLoginForm() {
clickElement(loginButton);
    }

    public static boolean isLoginButtonDisplayed() { return isElementDisplayed(loginButton);}
}
