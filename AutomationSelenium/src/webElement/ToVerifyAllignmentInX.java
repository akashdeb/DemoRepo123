package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentInX {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/1130Batch.html");
		
		Point usernamePos = driver.findElement(By.id("123")).getLocation();
		Point passwordPos = driver.findElement(By.id("345")).getLocation();
		
		int usernameStartX = usernamePos.getX();
		int passwordStartX = passwordPos.getX();
		
		System.out.println(usernameStartX);
		System.out.println(passwordStartX);
		
		if(usernameStartX == passwordStartX) {
			System.out.println("Pass: The textfields are alligned");
		}
		
		else
			System.out.println("Fail: The textfields are not alligned");

		driver.quit();
	}

}
