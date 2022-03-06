package selenium.flows;

import selenium.pages.FarmManagementFarmPage;
import selenium.pages.IrrigationBlocksPage;

public class FarmManagementPageFlows  {

   private FarmManagementFarmPage farmManagementPage = new FarmManagementFarmPage();


   public IrrigationBlocksPage selectIrrigationBlockTab(){

      farmManagementPage.clickOnIrrigationBlock();

      return new IrrigationBlocksPage();
   }
}
