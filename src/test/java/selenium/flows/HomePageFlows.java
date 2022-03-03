package selenium.flows;


import org.openqa.selenium.WebElement;
import selenium.pages.FarmManagementPage;
import selenium.pages.HomePage;

public class HomePageFlows {

    private HomePage homePage = new HomePage();
    private FarmManagementPage farmManagementPage = new FarmManagementPage();

    public WebElement chooseFarmByName(){
        homePage.clickOnTab();
        return homePage.getFarmNameTab();
    }

    public FarmManagementPage chooseElementFromSideBar(){
        homePage.clickOnSideBarNum5();
        homePage.clickOnFarmManagementButton();
        return farmManagementPage;
    }
}
