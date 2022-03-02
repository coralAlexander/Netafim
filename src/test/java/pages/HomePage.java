package pages;

import base.Base;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends Base {

    public HomePage() {
        super();
    }

    @FindBy(css = "div[class='containers']")
    private WebElement sideBarElements;

    @FindBy(css = "span[class='ng-value-label ng-star-inserted']")
    private WebElement farmNameTab;


    public void clickOnTab(){
        commonActions.click(farmNameTab);
    }
}
