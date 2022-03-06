package selenium.flows;

import org.openqa.selenium.WebElement;
import selenium.pages.IrrigationBlocksEditPage;

public class IrrigationBlocksEditPageFlows {

    private IrrigationBlocksEditPage irrigationBlocksEditPage = new IrrigationBlocksEditPage();

    public WebElement getBlockParameter(){
        return irrigationBlocksEditPage.getBlockNameInput();
    }

}
