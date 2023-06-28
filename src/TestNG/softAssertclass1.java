package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertclass1 {

	@Test
	public void TC6()
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="hello";
		String expResult="Hi";
		
		Assert.assertEquals(actResult, expResult,"Failed: both results are different");
		
		boolean actresult1=false;
		Assert.assertTrue(actresult1,"Failed: actual result is false");
		
		soft.assertAll();
	}
}
