package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEqualsFalse {

	@Test
	public void TC6()
	{
		String actResult="hello";
		String expResult="Hi";
		
		Assert.assertEquals(actResult, expResult,"Failed: both results are different");
		
		boolean actresult1=false;
		Assert.assertTrue(actresult1,"Failed: actual result is false");
	}
}
