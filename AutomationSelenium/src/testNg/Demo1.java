package testNg;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(invocationCount = 5)
	public void test() {
		System.out.println("Hi");
	}

}
