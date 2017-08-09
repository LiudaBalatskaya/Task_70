package listeners;

import base.TestBase;
import com.codeborne.selenide.testng.ScreenShooter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ListenerScreenshot extends ScreenShooter implements ITestListener {
    public  String name;

    @Attachment(value = "Screenshot", type = "image/png")
    private static byte[] captureScreenshot(String name) {
        try {
            File file1=((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
            // driver не поддерживает скриншот
            //File file1=((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(name));
            return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            return "Attachment Content Empty, can't create screenshot".getBytes();
        }
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        name = "C:\\TMP\\screenshotStart.png";
        captureScreenshot(name);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        name = "C:\\TMP\\screenshotSuccess.png";
        captureScreenshot(name);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        name = "C:\\TMP\\screenshotFailure.png";
        captureScreenshot(name);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}

