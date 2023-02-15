package testNg;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeOdsoFMDFieldType;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo6 {
	
	@Test
	public void demo() {
		int expectedResult = 420;
		int actualResult = 143;
		
		String expectedStringResult = "Qspiders";
		String actualStringResult = "Jspiders";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualResult, expectedResult);
		System.out.println("Pass int");
		
		soft.assertEquals(actualStringResult, expectedStringResult);
		System.out.println("Pass String");
		
		soft.assertAll();
		
		
	}


}
