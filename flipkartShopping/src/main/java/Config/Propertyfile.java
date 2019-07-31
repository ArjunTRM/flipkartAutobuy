package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import Tests.flipkartHome;
import Tests.Registration;
import Tests.addressField;

public class Propertyfile {
	static Properties prop =new Properties();
	static String ProjectPath= System.getProperty("user.dir");
	public static  void url_getProperties(){
		
		try {
			InputStream input =new FileInputStream(ProjectPath+"/src/main/java/Config/Config.properties");
			prop.load(input);
			String url1=prop.getProperty("url");
			flipkartHome.url=url1;
			System.out.println(flipkartHome.url);


		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static  void Reg_getProperties(){
		try {
			InputStream input =new FileInputStream(ProjectPath+"/src/main/java/Config/Config.properties");
			prop.load(input);
			String EmailId=prop.getProperty("Email");
			Registration.Email=EmailId;
			String Password=prop.getProperty("Password");
			Registration.Password=Password;

		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static  void Address_getProperties(){
		try {
			InputStream input =new FileInputStream(ProjectPath+"/src/main/java/Config/Config.properties");
			prop.load(input);
			String Name=prop.getProperty("Name");
			addressField.Name=Name;

			String Phone=prop.getProperty("Phone");
			addressField.Phone=Phone;

			String Pin=prop.getProperty("Pin");
			addressField.Pin=Pin;

			String Locality=prop.getProperty("Locality");
			addressField.Locality=Locality;

			String Address=prop.getProperty("Address");
			addressField.Address=Address;

			String City=prop.getProperty("City");
			addressField.City=City;

			String State=prop.getProperty("State");
			addressField.State=State;



		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static  void bankName_getProperties(){
		try {
			InputStream input =new FileInputStream(ProjectPath+"/src/main/java/Config/Config.properties");
			prop.load(input);
			String Bank=prop.getProperty("Bank");
			addressField.Bank=Bank;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
