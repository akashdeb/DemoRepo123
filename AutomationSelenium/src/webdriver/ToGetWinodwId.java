package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWinodwId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		
		WebDriver driver1=new ChromeDriver();
		String windowId2 = driver1.getWindowHandle();
		System.out.println(windowId2);
	}

}
