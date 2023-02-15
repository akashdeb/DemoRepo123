package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test
	public void demo() {
		int expectedResult = 420;
		int actualResult = 143;
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
	}

}
