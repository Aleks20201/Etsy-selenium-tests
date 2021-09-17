package login;

import common.BaseSeleniumTest;
import common.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LogInOnSiteEtsy extends BaseSeleniumTest {

    private final static Logger LOGGER = Logger.getLogger(TestUtils.class.getName());
    String signInButton = applicationProperties.readProperty("sign.in");
    String expectedText = applicationProperties.readProperty("sing.in.to.countinuee.text");

    @Test
    public void startTest() {

        driver.get(baseUrl);
        LOGGER.info("Open Etsy home page");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.applicationProperties.readProperty(signInButton)))).click();
        Assert.assertEquals(wait.until(ExpectedConditions.elementToBeClickable(By.id(this.applicationProperties.readProperty(expectedText)))).getText(), "Sign in to continue");

    }

}
