package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantAndDepenedant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone&crid=44JY1W21DP28&sprefix=iphon%2Caps%2C304&ref=nb_sb_noss_2");
		
		String price = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - (Product) RED']/../../../..//span[text()='49,900']")).getText();
		System.out.println(price);
	}

}
