package runTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		ClassA.test(new ChromeDriver(), "https://www.selenium.dev/", "Selenium");
		ClassA.test(new FirefoxDriver(), "https://www.selenium.dev/", "Selenium");
		ClassA.test(new EdgeDriver(), "https://www.selenium.dev/", "Selenium");


	}

}
