package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import Config.Propertyfile;
import Pages.Path_flipkartHome;

public class flipkartHome extends baseClass {
	public static String url=null;


	@BeforeTest
	public static void launchflipkartHome() throws InterruptedException{
		Propertyfile.url_getProperties();
		String driverPath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",driverPath+"/Drivers/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(4000);

	}
	@Test(priority =1)
	public static void Selecting_Mobile() throws InterruptedException{
		Path_flipkartHome.popupclose_button(driver).click();
		Thread.sleep(1000);
		Path_flipkartHome.Hover_Electronics(driver).click();
	}
}

