package selenium.verification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VerificationCrossPages {

    WebDriverWait wait;

    public VerificationCrossPages(WebDriverWait wait) {
        this.wait = wait;
    }

    public void verifyIrrigationBlockName(WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("value")).as("Wrong number of characters in password field").isEqualTo("Irrigation block 1");
    }
}
