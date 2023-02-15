package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		select.selectByValue("audi");
		Thread.sleep(2000);
		select.deselectAll();
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		select.selectByValue("audi");
		Thread.sleep(2000);
		
		select.deselectByIndex(3);
		Thread.sleep(2000);
		select.deselectByVisibleText("Saab");
		Thread.sleep(2000);
		select.deselectByValue("opel");
		
		
	}

}
