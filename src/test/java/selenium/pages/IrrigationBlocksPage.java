package selenium.pages;

import selenium.base.Base;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class IrrigationBlocksPage extends Base {

    public IrrigationBlocksPage() {
        super();
    }

    @FindBy(xpath = "(//button[contains(@type,'button')])[3]")
    private WebElement drawIrrigationBlockButton;

    public void clickOnIrrigationDrawBlockButton(){
        commonActions.click(drawIrrigationBlockButton);
    }

    public void moveAndClickByCoordinates(int x ,int y){
        commonActions.clickByCoordinates(x,y);
    }

    public void pressEnter(){
        commonActions.enter();
    }
}
