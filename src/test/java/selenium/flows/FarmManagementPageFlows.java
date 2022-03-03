package selenium.flows;

import selenium.pages.FarmManagementPage;
import selenium.pages.IrrigationBlocksPage;

public class FarmManagementPageFlows  {

   private FarmManagementPage farmManagementPage = new FarmManagementPage();


   public IrrigationBlocksPage selectIrrigationBlockTab(){

      farmManagementPage.clickOnIrrigationBlock();

      return new IrrigationBlocksPage();
   }
}
