import listeners.ListenerScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

@Listeners({ListenerScreenshot.class})
public class LoginTestListeners extends base.TestBase {
    @Test
    public void gotoPage() {
        gotoPage(driver);
        LoginPage.login(driver);
        Assert.assertTrue(true);
    }
}