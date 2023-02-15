package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingIDAndName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/1130Batch.html");
		
		WebElement username = driver.findElement(By.id("123"));
		WebElement password = driver.findElement(By.name("prakanksha"));

		username.sendKeys("Captain Jack Sparrow");
		password.sendKeys("Black Pearl");
	}

}
