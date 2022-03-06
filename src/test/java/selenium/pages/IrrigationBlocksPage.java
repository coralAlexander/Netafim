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
    @FindBy(xpath = "(//span[contains(@aria-haspopup,'true')])[1]")
    private WebElement blockEditOption;
    @FindBy(xpath = "(//button[contains(@role,'menuitem')])[1]")
    private WebElement blockEditButton;

    public void clickOnIrrigationDrawBlockButton(){
        commonActions.click(drawIrrigationBlockButton);
    }

    public void moveAndClickByCoordinates(int x ,int y){
        commonActions.clickByCoordinates(x,y);
    }

    public void pressEnter(){
        commonActions.enter();
    }

    public void clickOnSelectEditOption(){
        commonActions.click(blockEditOption);
    }

    public void clickOnBlockEditButton(){
        commonActions.click(blockEditButton);
    }
}
