package login;

import common.BaseSeleniumTest;
import org.testng.annotations.Test;

public class OpenEtsySite extends BaseSeleniumTest {

    @Test

    public void openEtsySite() {
        driver.get(baseUrl);


    }


}
