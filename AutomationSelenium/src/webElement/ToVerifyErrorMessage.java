package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMessage = "Username or Password is invalid";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String actualErrorMesssage = driver.findElement(By.className("errormsg")).getText();
		
		if(actualErrorMesssage.contains(expectedErrorMessage)) {
			System.out.println("Pass the error message has be verified");
		}
		else
			System.out.println("Fail the error message has not be verified");

		driver.quit();
	}

}
