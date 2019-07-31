package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import Tests.baseClass;

public class Page_addressFiled extends baseClass {

	public static WebElement Address_Tab(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]"));
		return element;
	}



	public static WebElement Address_Name(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		return element;
	}
	public static WebElement Address_Phone(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"));
		return element;
	}
	public static WebElement Address_Pin(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]"));
		return element;
	}
	public static WebElement Address_Locality(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/input[1]"));
		return element;
	}

	public static WebElement Address_Address(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/textarea[1]"));
		return element;
	}
	public static WebElement Address_City(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]"));
		return element;
	}
	public static Select Address_State(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		Select element= new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")));
		return element;
	}
	public static WebElement Address_Type(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/label[1]"));
		return element;
	}
	public static WebElement Address_deliveryButton(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[8]/button[1]"));
		return element;
	}
	public static WebElement Order_Summary(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);

		element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/button[1]"));
		return element;
	}
	public static WebElement Payement_Options(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/label[3]"));
		return element;
	}
	public static Select Select_Bank(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Bank drop down");
		Select element= new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/label[3]/div[2]/div[1]/div[1]/div[1]/div[2]/select[1]")));
		System.out.println(element);
		System.out.println("Bank drop down selected");
		return element;
	}
	public static WebElement Pay_button(WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/label[3]/div[2]/div[1]/div[1]/div[2]/button[1]"));
		System.out.println("Paybutton selected");
		return element;
	}
	


}
