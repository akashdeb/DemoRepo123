package testNg;

import org.testng.annotations.Test;

public class Demo3 {
	
	@Test
	public void qspiders() {
		System.out.println("Hello");
	}
	
	@Test(enabled = false)
	public void jspiders() {
		System.out.println("Hi");
	}
	
	@Test(invocationCount = 0)
	public void pyspiders() {
		System.out.println("How r u");
	}

}
