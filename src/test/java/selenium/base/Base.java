package selenium.base;

import selenium.actions.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.verification.VerificationLoginPage;

import static selenium.tests.BaseTest.getDriver;


public abstract class Base {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected CommonActions commonActions;
    protected VerificationLoginPage verification;
    protected Actions builder;

    public Base() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
        verification = new VerificationLoginPage(wait);
        builder = new Actions(driver);
        commonActions = new CommonActions(builder, driver, wait);
    }
}
