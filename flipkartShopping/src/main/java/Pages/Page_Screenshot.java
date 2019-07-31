package Pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Tests.baseClass;

public class Page_Screenshot extends baseClass{
	public static String scrPath=null;
	public static void screenShot(WebDriver driver){
		String scrPath=System.getProperty("user.dir");
		 Date d = new Date();
		System.out.println(scrPath);
		try {
			File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File(scrPath+"/Screenshots/"+d+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
