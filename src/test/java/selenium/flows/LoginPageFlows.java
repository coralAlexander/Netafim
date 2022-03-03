package selenium.flows;

import org.openqa.selenium.WebElement;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;

public class LoginPageFlows {

    private LoginPage loginPage = new LoginPage();

    public HomePage loginWithUserPassword(String userName, String password){
        login(userName,password);
        return new HomePage();
    }

    public LoginPageFlows loginFailed(String userName, String password){
        login(userName,password);
        loginPage.doScreenshot();
        return  this;
    }

    public WebElement missedCharacters(String userName){
        loginPage.fillUserName(userName);
        loginPage.clickOnPasswordField();
        loginPage.clickOnUserNameField();
        return  loginPage.getWrongUserName();
    }

    public WebElement missedPasswordCharacters(String userName){
        loginPage.fillUserName(userName);
        loginPage.clickOnPasswordField();
        loginPage.clickOnUserNameField();
        return  loginPage.getMissingPasswordErrorMessage();
    }

    public void login(String userName, String password) {
        loginPage.fillUserName(userName);
        loginPage.fillPassword(password);
        loginPage.pressLoginButton();

    }
}
