package selenium.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.Base;

@Getter
public class IrrigationBlocksEditPage extends Base {

    public IrrigationBlocksEditPage() {
        super();
    }

    @FindBy(xpath = "(//input[contains(@type,'text')])[2]")
    private WebElement blockNameInput;

}
