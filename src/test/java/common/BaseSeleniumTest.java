package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSeleniumTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseUrl;
    public ApplicationProperties applicationProperties = new ApplicationProperties("properties/common.properties");
    public static final int DEFAULT_WEBDRIVERWAIT_TIMEOUT = 15;
    public TestUtils testUtils;


    @BeforeClass
    public void setupEnv() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/web-driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, DEFAULT_WEBDRIVERWAIT_TIMEOUT);
        baseUrl = this.applicationProperties.readProperty("url");
        testUtils = new TestUtils();
        driver.manage().window().maximize();


    }

    @AfterClass
    public void clearEnv() {
        driver.close();
    }

}
