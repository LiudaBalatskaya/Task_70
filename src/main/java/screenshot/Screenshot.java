package screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {

    public static void capturesScreenshotFile(WebDriver driver, String screenshotName){
       String name = screenshotName;
       try{
           TakesScreenshot ts = (TakesScreenshot)driver;
           File source = ts.getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(source, new File(".\\target\\Screenshot\\"+screenshotName+".png"));
           FileUtils.copyFile(source, new File("c:\\TMP\\"+screenshotName+".png"));
           System.out.println("Screenshot taken");
       }
       catch(Exception e){
           System.out.println("Exception while taking screenshot" + e.getMessage());
       }
    }


}
