package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Tests.baseClass;

public class Path_RealmeMobile extends baseClass{

	public static WebElement Select_RealmeC2(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[3]/div[1]/div[1]"));
		return element;
	}

	public static WebElement Change_Model(WebDriver driver) throws InterruptedException{
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set <String> Handles = driver.getWindowHandles();
		for (String s1: Handles) {
			if(!s1.equals(parent)) {
				System.out.println(s1);
				driver.switchTo().window(s1);
				Thread.sleep(2000);
				element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]"));
			}
			else{
				System.out.println("Not available");
			}
		}
		return element;
	}

	public static WebElement addtoCart_RealmeC2(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
		return element;
	}


	public static WebElement Home_Nav(WebDriver driver){
		try {
			Thread.sleep(2000);
			element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]"));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement Cart_Nav(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]"));
		return element;
	}
	public static WebElement Cart_verify(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		boolean Button =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")).isEnabled();
		if (Button ==true){
			Thread.sleep(2000);

			System.out.println("Cart not Empty");
			element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]"));
		}
		else{
			System.out.println("Cart is empty --Failed");
		}
		return element;
	}


}
