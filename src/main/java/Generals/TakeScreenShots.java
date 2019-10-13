package Generals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShots {

	public static void takeScreenshot(WebDriver driver, String ssname) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver; // must be an Interface
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./src/test/resources/ScreenShots" + ssname + ".png"));

	}
}
