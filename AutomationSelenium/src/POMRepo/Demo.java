package POMRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public void handleMonthDropDown(WebDriver driver, String month) {
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText(month);
	}

}
