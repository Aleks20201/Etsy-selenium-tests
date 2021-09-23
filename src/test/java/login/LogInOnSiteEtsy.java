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
        System.out.println(this.signInButton);
        driver.get(baseUrl);
        LOGGER.info("Open Etsy home page");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(this.signInButton))).click();


    }

}
