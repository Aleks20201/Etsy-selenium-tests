package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.logging.Logger;

public class TestUtils {
    private final static Logger LOGGER = Logger.getLogger(TestUtils.class.getName());
    public ApplicationProperties applicationProperties = new ApplicationProperties("properties/common.properties");

    public void loginFunction(WebDriverWait wait) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(this.applicationProperties.readProperty("login.sign.in.button")))).click();
        LOGGER.info("Click on the Sign in button");
        Assert.assertEquals(wait.until(ExpectedConditions.elementToBeClickable(By.id(this.applicationProperties.readProperty("login.title.id")))).getText(), "Sign in to continue");
        LOGGER.info("Assert title text for Login popup");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(this.applicationProperties.readProperty("login.email.address.input")))).sendKeys(this.applicationProperties.readProperty("username"));
        LOGGER.info("Insert username in input field");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(this.applicationProperties.readProperty("login.continue.button")))).click();
        LOGGER.info("Click on the continue button");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.applicationProperties.readProperty("login.password")))).sendKeys(this.applicationProperties.readProperty("password"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.applicationProperties.readProperty("login.sign.popup.button")))).click();
    }
}
