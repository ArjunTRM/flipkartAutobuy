package Tests;


import org.testng.annotations.Test;

import Pages.Path_RealmeMobile;

public class RealmeMobile extends baseClass{
	@Test (priority =2)
	public static void Select_RealmeC2() throws InterruptedException{
		Path_RealmeMobile.Select_RealmeC2(driver).click();
		
	}

	@Test(priority =3)
	public static void Change_Model() throws InterruptedException{
		Path_RealmeMobile.Change_Model(driver).click();
		System.out.println("Successfully selected 32 GB model");
	
	}


	@Test(priority =4)
	public static void addtoCart_RealmeC2(){
		try {
			Path_RealmeMobile.addtoCart_RealmeC2(driver).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority =5)

	public static void Home_Nav(){
	
		try {
			Path_RealmeMobile.Home_Nav(driver).click();
			Path_RealmeMobile.Cart_Nav(driver).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority =6)
	public static void Cart_verify(){
		try {
			Path_RealmeMobile.Cart_verify(driver).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
