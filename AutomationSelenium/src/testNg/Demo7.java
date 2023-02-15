package testNg;

import org.testng.annotations.Test;

public class Demo7 {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Hi");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("Hello");
	}
	
	@Test(groups = "regression")
	public void test3() {
		System.out.println("What is ur name");
	}
	
	@Test(groups = "regression")
	public void test4() {
		System.out.println("Will u for a movie");
	}

}
