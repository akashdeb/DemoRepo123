package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void demo1() {
		Assert.fail();
		System.out.println("I wake up in the morning");
	}
	
	@Test(dependsOnMethods = "demo1" )
	public void demo2() {
		System.out.println("i brush my teeth");
	}
	
	@Test(dependsOnMethods = "demo2")
	public void demo3() {
		System.out.println("i have my break fast");
	}
	
	@Test
	public void demo4() {
		System.out.println("i come to qspiders");
	}

}
