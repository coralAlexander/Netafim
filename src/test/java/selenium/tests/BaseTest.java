package selenium.tests;

import selenium.flows.FarmManagementPageFlows;
import selenium.flows.HomePageFlows;
import selenium.flows.IrrigationBlocksPageFlows;
import selenium.flows.LoginPageFlows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.utils.DriverFactory;
import selenium.utils.HelpMethods;
import selenium.verification.VerificationCrossPages;
import selenium.verification.VerificationHomePage;
import selenium.verification.VerificationLoginPage;

import static selenium.utils.PropertyReader.getBrowser;
import static selenium.utils.PropertyReader.getLoginUrl;

public abstract class BaseTest {

    private static WebDriver driver;
    protected VerificationLoginPage verificationLoginPage;
    protected VerificationHomePage verificationHomePage;
    protected VerificationCrossPages verificationCrossPages;
    private WebDriverWait wait;
    protected HelpMethods helpMethods;

    LoginPageFlows loginPageFlows;
    HomePageFlows homePageFlows;
    FarmManagementPageFlows farmManagementPageFlows;
    IrrigationBlocksPageFlows irrigationBlocksPageFlows;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod()
    public void setUp() {
        driver = DriverFactory.getDriver(getBrowser());
        driver.get(getLoginUrl());
        loginPageFlows = new LoginPageFlows();
        homePageFlows = new HomePageFlows();
        farmManagementPageFlows = new FarmManagementPageFlows();
        irrigationBlocksPageFlows = new IrrigationBlocksPageFlows();
        wait = new WebDriverWait(driver,5);
        verificationLoginPage = new VerificationLoginPage(wait);
        verificationHomePage = new VerificationHomePage(wait);
        verificationCrossPages = new VerificationCrossPages(wait);
        helpMethods = new HelpMethods(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void threadSleep(Integer timeMs){
        try {
            Thread.sleep(timeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
