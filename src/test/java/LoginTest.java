import base.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;
import screenshot.Screenshot;

public class LoginTest extends TestBase {

    @Test
    public void gotoPage() {
        LoginPage page = new LoginPage();
        page.login();
        Screenshot.capturesScreenshotFile("seleniumFile1");
    }
}
