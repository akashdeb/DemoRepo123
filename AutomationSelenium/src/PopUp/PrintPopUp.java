package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AkashDeb/Desktop/printPop.html");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		new Robot().keyPress(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec("./autoit/Print.exe");
		
		
		
	}

}
