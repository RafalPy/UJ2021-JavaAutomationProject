package pariah.selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends DefaultPage {

    @FindBy(xpath = "//html/body/header/div[2]/div[2]/a/span")
    private WebElement logoutButton;

    @FindBy(css = "html > body > aside > div > ul > li.item4:nth-child(4) > a:nth-child(1)")
    private WebElement environmentListButton;

    @FindBy(css = "html > body > aside > div > ul > li.item4:nth-child(5) > a:nth-child(1)")
    private WebElement versionListButton;

    @FindBy(xpath = "//html/body/section/header/div/div/div/form/div[3]/span/div")
    private WebElement loginFormError;

    @FindBy(xpath = "/html/body/aside/div/ul/li[6]/a")
    private WebElement tagsListButton;

    public boolean isLoginFormErrorDisplayed() {return isElementDisplayed(loginFormError);}

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonDisplayed() {
        return isElementDisplayed(logoutButton);
    }

    public void goToEnvironmentListPage() {
        clickElement(environmentListButton);
    }

    public void goToVersionListPage() {
        clickElement(versionListButton);
    }

    public void clickLogout() {clickElement(logoutButton);}

    public void goToTagsListPage() { clickElement(tagsListButton);}
}

