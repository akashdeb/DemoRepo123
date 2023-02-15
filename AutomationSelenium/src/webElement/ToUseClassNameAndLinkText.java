package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassNameAndLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/1130Batch.html");
		
		driver.findElement(By.className("selenium")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Go to Selenium")).click();
	}

}
