package selenium.pages;

import selenium.base.Base;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends Base {

    public HomePage() {
        super();
    }

    @FindBy(xpath = "//div[@aria-haspopup='true'][contains(.,'5')]")
    private WebElement sideBarElement5;

    @FindBy(css = "span[class='ng-value-label ng-star-inserted']")
    private WebElement farmNameTab;

    @FindBy(xpath = "//button[contains(.,'Farm management')]")
    private WebElement farmManagementButton;


    public void clickOnTab(){
        commonActions.click(farmNameTab);
    }

    public void clickOnSideBarNum5(){
        commonActions.click(sideBarElement5);
    }

    public void clickOnFarmManagementButton(){
        commonActions.click(farmManagementButton);
    }
}
