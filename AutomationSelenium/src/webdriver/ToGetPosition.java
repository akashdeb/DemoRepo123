package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		int startX = pos.getX();
		int startY = pos.getY();
		
		System.out.println("the start x is : "+startX);
		System.out.println("the start y is : "+startY);
	}

}
