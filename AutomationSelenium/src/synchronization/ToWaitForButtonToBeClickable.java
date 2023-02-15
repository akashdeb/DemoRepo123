package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitForButtonToBeClickable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
	
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		
		continueButton.click();
		
		/*FluentWait wait=new FluentWait(driver);
		wait.wait(20);
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.titleContains("Enter"));*/
	}

}
