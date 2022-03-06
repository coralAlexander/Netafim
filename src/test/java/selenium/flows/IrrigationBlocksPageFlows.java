package selenium.flows;

import selenium.pages.IrrigationBlocksEditPage;
import selenium.pages.IrrigationBlocksPage;

public class IrrigationBlocksPageFlows {

    private IrrigationBlocksPage irrigationBlocksPage = new IrrigationBlocksPage();

    public IrrigationBlocksPageFlows drawIrrigationBlock(){

        irrigationBlocksPage.clickOnIrrigationDrawBlockButton();

        irrigationBlocksPage.moveAndClickByCoordinates(1100 , 700);
        irrigationBlocksPage.moveAndClickByCoordinates(1100,500);
        irrigationBlocksPage.moveAndClickByCoordinates(600,700);
        irrigationBlocksPage.moveAndClickByCoordinates(600,500);
        //irrigationBlocksPage.pressEnter();

        return this;
    }

    public  IrrigationBlocksEditPage chooseBlockEditOption(){
        irrigationBlocksPage.clickOnSelectEditOption();
        irrigationBlocksPage.clickOnBlockEditButton();
        return new IrrigationBlocksEditPage();
    }
}
