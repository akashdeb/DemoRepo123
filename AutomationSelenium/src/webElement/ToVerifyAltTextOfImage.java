package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		String expectedAltText = "Flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		String actualAltText = driver.findElement(By.xpath("//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png\"]")).getAttribute("alt");
		
		if(actualAltText.contains(expectedAltText)) {
			System.out.println("Pass: The alt text is verified");
		}
		else
			System.out.println("Fail: The alt text is not verified");

		driver.quit();
	}

}
