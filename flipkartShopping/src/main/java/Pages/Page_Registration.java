package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Tests.baseClass;

public class Page_Registration extends baseClass{

	public static WebElement Login_Email(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
		return element;
		}
	public static WebElement Email_continueButton(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
		return element;
		}
	public static WebElement Login_password(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
		return element;
		}
	public static WebElement Password_loginButton(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
		return element;
		}
	}
