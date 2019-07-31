package Tests;

import org.testng.annotations.Test;
import Pages.Page_Screenshot;

public class screenShot extends baseClass{

	@Test(priority =10)
	public void screenShot(){
		try {
			Thread.sleep(1000);
			Page_Screenshot.screenShot(driver);
			System.out.println("Screenshot captured successfully");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
