package selenium.tests;

import org.testng.annotations.Test;

import static selenium.utils.PropertyReader.getPassword;
import static selenium.utils.PropertyReader.getUser;

public class CrossPagesTests extends BaseTest {

    @Test(priority = 1)
    public void createPolygon(){
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
        homePageFlows.chooseElementFromSideBar();
        farmManagementPageFlows.selectIrrigationBlockTab();
        //irrigationBlocksPageFlows.drawIrrigationBlock();
        //threadSleep(1000);
        irrigationBlocksPageFlows.chooseBlockEditOption();
        verificationCrossPages.verifyIrrigationBlockName(irrigationBlocksEditFlows.getBlockParameter());
        System.out.println("Success");
    }
}
