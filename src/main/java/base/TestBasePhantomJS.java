package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import screenshot.Screenshot;

import java.io.File;

public class TestBasePhantomJS {
    public void verifyRMSYS(){

        final String BASE_URL = "https://192.168.100.26/";
        File file = new File("C:\\Phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
        WebDriver driver;
        driver = new PhantomJSDriver();
        driver.get(BASE_URL);
        String windowHandle = driver.getWindowHandle();
        Screenshot.capturesScreenshotFile(driver, "PhantomJSFile");

    }

}
