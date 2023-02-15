package basicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import POMRepo.TaskPage;

public class ToVerifyHomePage {

	@Test
	public void toVerifyHomePage() throws InterruptedException {

		String expectedTitle = "Enter";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified");
		
		home.clickOnTaskButton();
		
		TaskPage task=new TaskPage(driver);
		task.createCustomer("Sunil");
		
		String actualCustomerName = task.verifyCustomerName("Sunil");
		
		Thread.sleep(3000);
		System.out.println(actualCustomerName);
		
		home.logoutAction();
		
		driver.quit();
	}

}
