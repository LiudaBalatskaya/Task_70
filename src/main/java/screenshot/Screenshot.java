package screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static utilities.DriverSingleton.driver;

public class Screenshot {

    public static void capturesScreenshotFile(String screenshotName) {
        String name = screenshotName;
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(".\\target\\Screenshot\\" + screenshotName + ".png"));
        } catch (Exception e) {
            LOGGER.info("Exception while taking screenshot" + e.getMessage());
        }
    }

}
