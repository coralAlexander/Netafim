package verification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VerificationHomePage {
    WebDriverWait wait;

    public VerificationHomePage(WebDriverWait wait) {
        this.wait = wait;
    }

    public void assertThatSpecificFarmName(WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("innerText")).as("Wrong number of characters in password field").isEqualTo("alex");
    }

    public void assertSideBar(WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("innerText")).as("Wrong number of characters in password field").isEqualTo("1\n2\n3\n4\n5");
    }
}
