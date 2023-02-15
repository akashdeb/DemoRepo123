package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.events.Event.ID;

public class ToGetChildTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds) {
			driver.switchTo().window(id);
				if(!id.equals(parentId)){
					String childTitle = driver.getTitle();
					System.out.println(childTitle);
					break;
			}
		}
		driver.switchTo().window(parentId);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
	}

}
