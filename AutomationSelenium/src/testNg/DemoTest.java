package testNg;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(priority = 2)
	public void qspiders() {
		System.out.println("Hello");
	}
	
	@Test(priority = 1)
	public void jspiders() {
		System.out.println("Hi");
	}
	
	@Test(priority = -3)
	public void pyspiders() {
		System.out.println("How r u");
	}

}
