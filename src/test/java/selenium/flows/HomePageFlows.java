package selenium.flows;


import org.openqa.selenium.WebElement;
import selenium.pages.FarmManagementFarmPage;
import selenium.pages.HomePage;

public class HomePageFlows {

    private HomePage homePage = new HomePage();

    public WebElement chooseFarmByName(){
        homePage.clickOnTab();
        return homePage.getFarmNameTab();
    }

    public FarmManagementFarmPage chooseElementFromSideBar(){
        homePage.clickOnSideBarNum5();
        homePage.clickOnFarmManagementButton();
        return new FarmManagementFarmPage();
    }
}
