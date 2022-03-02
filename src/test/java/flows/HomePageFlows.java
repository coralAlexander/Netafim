package flows;


import org.openqa.selenium.WebElement;
import pages.HomePage;

public class HomePageFlows {

    private HomePage homePage = new HomePage();

    public WebElement chooseFarmByName(){
        homePage.clickOnTab();
        return homePage.getFarmNameTab();
    }

    public WebElement getSideBar(){
        return homePage.getSideBarElements();
    }
}
