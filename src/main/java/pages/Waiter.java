package pages;

import base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private static final int DEFAULT_TIME_OUT = 10;

    private static WebDriverWait getWaiter() {
        return new WebDriverWait(TestBase.getWebDriver(), DEFAULT_TIME_OUT);
    }

    public static void waitForPageTitle(String title) {
        getWaiter().until(ExpectedConditions.titleIs(title));
    }

}