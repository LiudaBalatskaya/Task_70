package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Waiter;
import utilities.DriverSingleton;


public abstract class TestBase {

    protected static final String BASE_URL = "https://192.168.100.26/";
    public  WebDriver driver;

    public  WebDriver getWebDriver() {
        return driver;
    }

    @BeforeClass
    public void setup() {
        DriverSingleton tmp = DriverSingleton.getInstance();
        driver = tmp.openBrowser();
        driver.get(BASE_URL);
        Waiter.waitForPageTitle("RMSys - Sign In");
    }

    @AfterClass
    public void exit() {
        driver.close();
    }

}
