package Tests;


import org.testng.annotations.Test;

import Config.Propertyfile;
import Pages.Page_addressFiled;

public class addressField extends baseClass{


	@Test(priority =8)

	public static void Address(){
		Propertyfile.Address_getProperties();
		try {
			Page_addressFiled.Address_Tab(driver).click();
			Page_addressFiled.Address_Name(driver).sendKeys(Name);
			Page_addressFiled.Address_Phone(driver).sendKeys(Phone);
			Page_addressFiled.Address_Pin(driver).sendKeys(Pin);
			Page_addressFiled.Address_Locality(driver).sendKeys(Locality);
			Page_addressFiled.Address_Address(driver).sendKeys(Address);
			Page_addressFiled.Address_City(driver).sendKeys(City);
			Page_addressFiled.Address_State(driver).selectByValue(State);
			Page_addressFiled.Address_Type(driver).click();
			Page_addressFiled.Address_deliveryButton(driver).click();
			

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority =8)

	public static void orderSummary(){
		try {
			Page_addressFiled.Order_Summary(driver).click();
			Page_addressFiled.Payement_Options(driver).click();
			System.out.println("Net banking selected");
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test(priority =9)

	public static void Bank_Selecting(){
		Propertyfile.bankName_getProperties();
		try {
			Propertyfile.bankName_getProperties();
			Page_addressFiled.Select_Bank(driver).selectByValue(Bank);
			Page_addressFiled.Pay_button(driver).click();
			System.out.println("Navigate to Bank screen");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
