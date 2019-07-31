package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Tests.baseClass;

public class Path_flipkartHome extends baseClass{
	
	public static WebElement popupclose_button(WebDriver driver){
		element=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		return element;
	}
	public static WebElement Hover_Electronics(WebDriver driver) throws InterruptedException{
		Actions Hover_Electronics =new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]"));
		System.out.println("passed");
		Hover_Electronics.moveToElement(element1).build().perform();
		Thread.sleep(2000);
		element =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]"));
		System.out.println("passed");
		return element;
	}
	
}
