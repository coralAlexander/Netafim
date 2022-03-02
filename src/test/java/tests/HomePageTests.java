package tests;

import org.testng.annotations.Test;

import static utils.PropertyReader.getPassword;
import static utils.PropertyReader.getUser;

public class HomePageTests extends BaseTest{

    @Test(priority = 1)
    public void getSideBar() {
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
        threadSleep(3000);
        verificationHomePage.assertThatSpecificFarmName(homePageFlows.chooseFarmByName());
        System.out.println("done");
    }
}
