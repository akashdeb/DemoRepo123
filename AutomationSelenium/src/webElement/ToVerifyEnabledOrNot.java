package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		boolean enabled = driver.findElement(By.xpath("(//button[contains(text(), 'Continue')])[1]")).isEnabled();
		
		if(enabled) {
			System.out.println("Pass: The button enabled");
		}
		else
			System.out.println("Fail: The button not enabled");

	}

}
