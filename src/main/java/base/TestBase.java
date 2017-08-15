package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Waiter;
import utilities.Driver;

import static utilities.Driver.driver;

public abstract class TestBase {

    protected static final String BASE_URL = "https://192.168.100.26/";

    public static WebDriver getWebDriver() {
        return driver;
    }

    @BeforeClass
    public static void setup() {
        Driver.Initialize();
        driver.get(BASE_URL);
        Waiter.waitForPageTitle("RMSys - Sign In");
    }

    @AfterClass
    public void exit() {
        Driver.close();
    }

}
