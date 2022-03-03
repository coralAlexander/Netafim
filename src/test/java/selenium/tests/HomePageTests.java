package selenium.tests;

import org.testng.annotations.Test;

import static selenium.utils.PropertyReader.getPassword;
import static selenium.utils.PropertyReader.getUser;

public class HomePageTests extends BaseTest{

    @Test(priority = 1)
    public void getSideBar() {
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
        threadSleep(3000);
        verificationHomePage.assertThatSpecificFarmName(homePageFlows.chooseFarmByName());
        System.out.println("done");
    }
}
