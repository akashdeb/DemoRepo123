package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/1130Batch.html");
		
		Dimension usernameDim = driver.findElement(By.id("123")).getSize();
		int usernameHeight = usernameDim.getHeight();
		int usernameWidth = usernameDim.getWidth();
		
		System.out.println(usernameHeight+" "+usernameWidth);
		
		Dimension passwordDim = driver.findElement(By.id("345")).getSize();
		int passwordHeight = passwordDim.getHeight();
		int passwordWidth = passwordDim.getWidth();
		System.out.println(passwordHeight+" "+passwordWidth);
		
		if(usernameHeight == passwordHeight && usernameWidth==passwordWidth) {
			System.out.println("Pass the dimemsions are verified");
		}
		else
			System.out.println("Fail the dimensions are not verified");
		
		driver.quit();
	}

}
