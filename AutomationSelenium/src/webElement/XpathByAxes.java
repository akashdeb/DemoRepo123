package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		String productName = "APPLE iPhone 13 (Midnight, 128 GB)";
		String productPrice  = "₹61,999";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		
		String price = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productPrice+"']")).getText();
		System.out.println(price);
	}

}
