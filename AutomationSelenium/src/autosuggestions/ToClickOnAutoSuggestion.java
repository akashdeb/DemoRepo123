package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("pathan");
		Thread.sleep(2000);
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[text()='pathan']"));
		for(WebElement suggestion:autoSuggestions) {
			if(suggestion.getText().equals("pathan budget")) {
				suggestion.click();
				break;
			}
		}
		
	}

}
