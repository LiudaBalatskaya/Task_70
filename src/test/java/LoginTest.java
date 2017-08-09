import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import screenshot.Screenshot;

public class LoginTest extends TestBase {

    @Test
    public void gotoPage(){
        gotoPage(driver);
        LoginPage.login(driver);
        Screenshot.capturesScreenshotFile(driver, "seleniumFile");
        Assert.assertTrue(true);
    }
}
