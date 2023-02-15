package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/1130Batch.html");
		
		Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		Rectangle passwordRect = driver.findElement(By.id("345")).getRect();
		
		int usernameHeight = usernameRect.getHeight();
		int usernameStartY = usernameRect.getY();
		int usernameEndY = usernameHeight+usernameStartY;
		
		int passwordStartY = passwordRect.getY();
		
		if(passwordStartY>=usernameEndY) {
			System.out.println("Pass: The textfields are not overlapping");
		}
		else
			System.out.println("Fail: The textfields are overlapping");
		
		driver.quit();

	}

}
