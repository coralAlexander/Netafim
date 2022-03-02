package tests;

import org.testng.annotations.Test;

import static utils.PropertyReader.getPassword;
import static utils.PropertyReader.getUser;

public class CrossPagesTests extends BaseTest {

    @Test(priority = 1)
    public void createPolygon(){
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
        verificationHomePage.assertSideBar(homePageFlows.getSideBar());
    }
}
