package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		Point pos = new Point(100, 100);
		driver.manage().window().setPosition(pos);
		
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(-50, -50));
		
		Point newPos = driver.manage().window().getPosition();
		System.out.println("New Postion : "+newPos);
	}

}
