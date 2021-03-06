package selenium.pages;

import selenium.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FarmManagementFarmPage extends Base {

    public FarmManagementFarmPage() {
        super();
    }

    @FindBy(xpath = "(//a[@tabindex='0'])[1]")
    private WebElement irrigationBlock;


    public void clickOnIrrigationBlock(){
        commonActions.click(irrigationBlock);
    }

   /* public void moveToCoordinatesAndClick(int x , int y){
        commonActions.clickByCoordinates(x,y);
    }*/
}
