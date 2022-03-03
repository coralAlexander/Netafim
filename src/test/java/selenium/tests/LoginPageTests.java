package selenium.tests;

import org.testng.annotations.Test;

import static selenium.utils.PropertyReader.getPassword;
import static selenium.utils.PropertyReader.getUser;

public class LoginPageTests extends BaseTest {

    private final static String expectedLandingPage = "https://nbvxuserportalrc.z6.web.core.windows.net/home";


    @Test(priority = 1)
    public void loginVerificationHappyFlow() {
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
        threadSleep(3000);
        verificationLoginPage.assertCurrentPageUrl(helpMethods.getCurrentUrl(), expectedLandingPage);
    }

    @Test(priority = 2)
    public void loginUnHappyFlowInvalidUserPassword() {
        loginPageFlows.loginFailed("user", "password2222222");
    }

    @Test(priority = 3)
    public void userNameFieldWrongNumberOfCharacters() {
        verificationLoginPage.assertWrongQuantityOfCharactersInUserNameField(loginPageFlows.missedCharacters("err"), "Invalid or missing user name.");
    }

    @Test(priority = 4)
    public void passwordFieldWrongNumberOfCharacters() {
        verificationLoginPage.assertWrongQuantityOfCharactersInPasswordField(loginPageFlows.missedPasswordCharacters("sds1"), "Missing password.");
    }
}
