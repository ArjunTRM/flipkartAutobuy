package Tests;


import org.testng.annotations.Test;
import Config.Propertyfile;
import Pages.Page_Registration;

public class Registration extends baseClass {
	public static String Email=null;
	public static String Password=null;

	@Test(priority =7)
	public static void Login(){
		Propertyfile.Reg_getProperties();
		try {
			Page_Registration.Login_Email(driver).sendKeys(Email);
			Page_Registration.Email_continueButton(driver).click();
			Page_Registration.Login_password(driver).sendKeys(Password);
			Page_Registration.Password_loginButton(driver).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
